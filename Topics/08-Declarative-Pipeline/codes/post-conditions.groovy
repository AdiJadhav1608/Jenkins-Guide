/*
===========================================
📌 POST CONDITIONS IN PIPELINE
===========================================

Post conditions define actions
that run after pipeline execution.
*/

pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Executing build stage'
            }
        }
    }

    post {

        success {
            echo 'Build succeeded 🎉'
        }

        failure {
            echo 'Build failed ❌'
        }

        always {
            echo 'Pipeline execution completed'
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

post {}     → Executes after pipeline ends
success    → Runs only if build succeeds
failure    → Runs only if build fails
always     → Runs in all cases

✔ Useful for notifications
✔ Cleanup tasks
✔ Logging
*/
