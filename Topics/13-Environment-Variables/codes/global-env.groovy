/*
===========================================
🌍 GLOBAL ENVIRONMENT VARIABLES
===========================================

This pipeline demonstrates:
✔ Pipeline-wide environment variables
✔ Variable reuse across stages
*/

pipeline {

    agent any

    // 🔹 Global environment variables
    environment {
        APP_NAME = "JenkinsApp"
        ENV_NAME = "Production"
    }

    stages {

        stage('Show App Info') {
            steps {
                echo "Application: ${APP_NAME}"
                echo "Environment: ${ENV_NAME}"
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying ${APP_NAME} to ${ENV_NAME}"
            }
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

environment {} → Defines global variables
APP_NAME       → Application identifier
ENV_NAME       → Target environment
${VAR}         → Variable access syntax

✔ Available in all stages
✔ Cleaner pipeline configuration
*/
