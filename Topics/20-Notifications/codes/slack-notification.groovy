/*
=========================================================
💬 Jenkins Slack Notification Pipeline
=========================================================

This pipeline demonstrates:

✔ Sending Slack message on every build
✔ Sending specific message on SUCCESS
✔ Sending specific message on FAILURE
✔ Using build metadata inside Slack message

Plugin Required:
- Slack Notification Plugin
=========================================================
*/

pipeline {

    // Run pipeline on any available agent
    agent any

    stages {

        // -------------------------------
        // Stage 1: Build
        // -------------------------------
        stage('Build') {
            steps {
                echo "Building application..."
            }
        }
    }

    /*
    =========================================================
    POST SECTION
    =========================================================
    This executes after pipeline stages.
    Used mainly for notifications.
    */

    post {

        // -----------------------------------------
        // Always runs (Success or Failure)
        // -----------------------------------------
        always {

            slackSend(

                // Slack channel name
                channel: '#devops-alerts',

                // Multiline Slack message
                message: """
                📌 Job: ${env.JOB_NAME}
                🔢 Build: #${env.BUILD_NUMBER}
                📊 Status: ${currentBuild.currentResult}
                🔗 URL: ${env.BUILD_URL}
                """
            )
        }

        // -----------------------------------------
        // If Build is SUCCESS
        // -----------------------------------------
        success {

            slackSend(
                channel: '#devops-alerts',
                message: "✅ SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}"
            )
        }

        // -----------------------------------------
        // If Build FAILS
        // -----------------------------------------
        failure {

            slackSend(
                channel: '#devops-alerts',
                message: "❌ FAILURE: ${env.JOB_NAME} #${env.BUILD_NUMBER}"
            )
        }
    }
}

/*
=========================================================
🔎 Important Variables Used
=========================================================

env.JOB_NAME → Job name
env.BUILD_NUMBER → Build number
env.BUILD_URL → Direct link to build
currentBuild.currentResult → SUCCESS / FAILURE / UNSTABLE

=========================================================
🔐 Production Best Practices
=========================================================

✔ Store Slack token in Jenkins Credentials
✔ Do NOT expose webhook in code
✔ Send alerts only for important events
✔ Use separate channel for production alerts

=========================================================
💡 Real-World Tip
=========================================================

In enterprise environments:

- Dev → #dev-alerts
- QA → #qa-alerts
- Production → #prod-alerts


=========================================================
*/
