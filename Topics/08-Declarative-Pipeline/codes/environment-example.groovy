/*
===========================================
🌍 ENVIRONMENT VARIABLES IN PIPELINE
===========================================

This pipeline shows:
✔ Global environment variables
✔ Accessing variables inside stages
*/

pipeline {

    agent any

    // 🔹 Environment variables
    environment {
        APP_NAME = "JenkinsApp"
        ENV_TYPE = "Production"
    }

    stages {

        stage('Show Environment') {
            steps {
                echo "Application: ${APP_NAME}"
                echo "Environment: ${ENV_TYPE}"
            }
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

environment {}  → Defines global variables
APP_NAME        → Custom variable
ENV_TYPE        → Environment type
${VAR_NAME}     → Access variable in Groovy

📌 Variables are available in all stages.
*/
