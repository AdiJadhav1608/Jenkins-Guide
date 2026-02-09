/*
===========================================
🚀 COMPLETE CI/CD PIPELINE IN JENKINS
===========================================

This pipeline demonstrates:
✔ Source code checkout
✔ Build automation
✔ Testing
✔ Docker image creation
✔ Deployment stage
*/

pipeline {

    agent any

    environment {
        APP_NAME = "demo-app"
        IMAGE    = "aditya/demo-app:latest"
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code'
                // scm checkout happens automatically if Jenkinsfile is in repo
            }
        }

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

        stage('Package') {
            steps {
                echo 'Packaging application'
                sh "docker build -t ${IMAGE} ."
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application'
            }
        }
    }

    post {

        success {
            echo 'CI/CD Pipeline completed successfully 🎉'
        }

        failure {
            echo 'CI/CD Pipeline failed ❌'
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

Checkout Stage → Fetches source code
Build Stage    → Compiles / prepares app
Test Stage     → Validates application
Package Stage → Builds Docker image
Deploy Stage  → Deploys to environment

post {}        → Executes after pipeline
success       → Runs on successful build
failure       → Runs on failed build

✔ Represents real-world CI/CD flow
✔ Easy to extend for production
*/
