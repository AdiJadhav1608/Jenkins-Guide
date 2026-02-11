// ==================================================
// Jenkins Pipeline Running on Kubernetes
// ==================================================
//
// PURPOSE:
// This pipeline runs inside a dynamically created
// Kubernetes Pod using the Kubernetes plugin.
//
// FLOW:
// 1. Jenkins starts pipeline.
// 2. Kubernetes plugin creates a Pod using YAML.
// 3. Stages execute inside container.
// 4. Pod is deleted after job completion.
//
// INTERVIEW IMPORTANT:
// - What is dynamic agent?
// - How does Jenkins communicate with Kubernetes?
// - Why are Pods auto-deleted?

pipeline {

    agent {
        kubernetes {
            yamlFile 'k8s-pod-template.yaml'
            // Uses external Pod template file
            // Jenkins will create Pod based on this YAML
        }
    }

    stages {

        stage('Checkout Code') {
            steps {
                checkout scm
                // Pulls code from configured Git repository
            }
        }

        stage('Build Docker Image') {
            steps {
                container('docker') {
                    // Executes commands inside container named "docker"
                    // Must match container name defined in YAML

                    sh 'docker version'
                    // Verifies Docker is available inside Pod

                    sh 'docker build -t my-app:latest .'
                    // Builds Docker image from Dockerfile
                }
            }
        }

        stage('Run Tests') {
            steps {
                container('docker') {
                    sh 'echo Running tests...'
                    // Placeholder for real testing commands
                }
            }
        }
    }

    post {
        success {
            echo "Build successfully executed inside Kubernetes Pod"
            // Runs when all stages succeed
        }
        failure {
            echo "Pipeline failed"
            // Runs if any stage fails
        }
    }
}
