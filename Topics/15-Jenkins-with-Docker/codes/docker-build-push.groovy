/*
===========================================
🐳 DOCKER BUILD & PUSH PIPELINE
===========================================

This pipeline demonstrates:
✔ Docker image build
✔ Docker Hub authentication
✔ Image push to registry
*/

pipeline {

    agent any

    environment {
        IMAGE_NAME = "aditya/demo-app"
        IMAGE_TAG  = "latest"
    }

    stages {

        stage('Build Image') {
            steps {
                sh "docker build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
            }
        }

        stage('Push Image') {
            steps {
                withCredentials([
                    usernamePassword(
                        credentialsId: 'dockerhub-creds',
                        usernameVariable: 'DOCKER_USER',
                        passwordVariable: 'DOCKER_PASS'
                    )
                ]) {
                    sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
                    sh "docker push ${IMAGE_NAME}:${IMAGE_TAG}"
                }
            }
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

docker build → Creates Docker image
-t           → Tags image
docker login → Authenticates registry
docker push  → Uploads image

✔ Credentials are masked
✔ No hardcoded secrets
*/
