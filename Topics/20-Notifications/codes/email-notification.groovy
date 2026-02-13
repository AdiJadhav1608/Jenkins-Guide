/*
=========================================================
📧 Jenkins Email Notification Pipeline (Declarative)
=========================================================

This pipeline demonstrates:

✔ How to send email on SUCCESS
✔ How to send email on FAILURE
✔ How to use environment variables
✔ How to structure post-build actions

Plugin Required:
- Email Extension Plugin (emailext)
=========================================================
*/

pipeline {

    // Defines where the pipeline will run
    agent any

    stages {

        // -------------------------------
        // Stage 1: Build
        // -------------------------------
        stage('Build') {
            steps {
                // Simulating build process
                echo "Building application..."
            }
        }

        // -------------------------------
        // Stage 2: Test
        // -------------------------------
        stage('Test') {
            steps {
                // Simulating test execution
                echo "Running tests..."
            }
        }
    }

    /*
    =========================================================
    POST SECTION
    =========================================================
    This block executes AFTER all stages are completed.
    Used for notifications, cleanup, reporting, etc.
    */

    post {

        // -------------------------------
        // If Build is SUCCESSFUL
        // -------------------------------
        success {

            emailext(

                // Subject line of the email
                subject: "SUCCESS: Job ${env.JOB_NAME} #${env.BUILD_NUMBER}",

                // HTML formatted email body
                body: """
                <h2>Build Successful ✅</h2>
                <p><b>Job Name:</b> ${env.JOB_NAME}</p>
                <p><b>Build Number:</b> ${env.BUILD_NUMBER}</p>
                <p><b>Build URL:</b> ${env.BUILD_URL}</p>
                """,

                // Recipient email (Replace with real email)
                to: "team@example.com"
            )
        }

        // -------------------------------
        // If Build FAILS
        // -------------------------------
        failure {

            emailext(

                subject: "FAILURE: Job ${env.JOB_NAME} #${env.BUILD_NUMBER}",

                body: """
                <h2>Build Failed ❌</h2>
                <p><b>Job Name:</b> ${env.JOB_NAME}</p>
                <p><b>Build Number:</b> ${env.BUILD_NUMBER}</p>
                <p><b>Check Console Output:</b> ${env.BUILD_URL}</p>
                """,

                to: "team@example.com"
            )
        }
    }
}

/*
=========================================================
🔎 Important Environment Variables Used
=========================================================

env.JOB_NAME      → Name of the Jenkins job
env.BUILD_NUMBER  → Current build number
env.BUILD_URL     → Direct link to build console

=========================================================
🔐 Production Recommendation
=========================================================

✔ Store email credentials in Jenkins Credentials
✔ Do NOT hardcode passwords
✔ Use app password for Gmail
✔ Restrict notification frequency
=========================================================
*/
