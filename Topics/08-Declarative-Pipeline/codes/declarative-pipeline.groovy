/*
===========================================
🚀 BASIC DECLARATIVE PIPELINE
===========================================

This file demonstrates:
✔ Standard declarative structure
✔ Agent usage
✔ Multiple stages
*/

pipeline {

    // 🔹 Defines execution node
    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Building application'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application'
            }
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

pipeline        → Root block (mandatory)
agent any       → Run on any Jenkins agent
stages          → Collection of stages
stage()         → Logical pipeline step
steps           → Actual commands
echo            → Prints logs in console
*/
