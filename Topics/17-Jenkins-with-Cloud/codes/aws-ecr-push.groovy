==============================================
🚀 Jenkins Pipeline – Build & Push Docker Image to AWS ECR
==============================================

📌 PURPOSE
- Build Docker image from source code
- Authenticate Jenkins with AWS ECR
- Push versioned image to ECR repository

🔐 PREREQUISITES
- AWS CLI installed on Jenkins agent
- Docker installed on Jenkins agent
- IAM user with ECR permissions
- AWS credentials configured in Jenkins

----------------------------------------------
🧾 JENKINS PIPELINE CODE (WITH COMMENTS)
----------------------------------------------

pipeline {
    agent any                     // Run on any available Jenkins agent

    environment {
        AWS_REGION     = "ap-south-1"     // AWS region where ECR exists
        AWS_ACCOUNT_ID = "123456789012"   // Replace with your AWS Account ID
        ECR_REPO_NAME  = "my-app-repo"    // ECR repository name
        IMAGE_TAG      = "${BUILD_NUMBER}"// Image tag using Jenkins build number
    }

    stages {

        stage('Checkout Code') {
            steps {
                // Pull latest source code from Git repository
                checkout scm
            }
        }

        stage('Login to AWS ECR') {
            steps {
                script {
                    // Authenticate Docker with AWS ECR using AWS CLI
                    sh """
                    aws ecr get-login-password --region ${AWS_REGION} |
                    docker login --username AWS --password-stdin \
                    ${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com
                    """
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image using Dockerfile
                    sh "docker build -t ${ECR_REPO_NAME}:${IMAGE_TAG} ."
                }
            }
        }

        stage('Tag Docker Image') {
            steps {
                script {
                    // Tag image according to ECR repository format
                    sh """
                    docker tag ${ECR_REPO_NAME}:${IMAGE_TAG} \
                    ${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com/${ECR_REPO_NAME}:${IMAGE_TAG}
                    """
                }
            }
        }

        stage('Push Image to ECR') {
            steps {
                script {
                    // Push Docker image to AWS ECR
                    sh """
                    docker push \
                    ${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_REGION}.amazonaws.com/${ECR_REPO_NAME}:${IMAGE_TAG}
                    """
                }
            }
        }
    }

    post {
        success {
            echo "✅ Docker image pushed successfully to AWS ECR"
        }
        failure {
            echo "❌ Docker image push failed"
        }
    }
}

----------------------------------------------
🧠 STAGE-WISE EXPLANATION
----------------------------------------------
- environment: Stores reusable AWS & Docker variables
- Checkout Code: Fetches source code from SCM
- Login to AWS ECR: Secure Docker authentication
- Build Docker Image: Creates image locally
- Tag Docker Image: Converts image to ECR format
- Push Image to ECR: Uploads image to cloud registry

----------------------------------------------
📦 OUTPUT
----------------------------------------------
ECR Image:
AWS_ACCOUNT_ID.dkr.ecr.AWS_REGION.amazonaws.com/ECR_REPO_NAME:BUILD_NUMBER

