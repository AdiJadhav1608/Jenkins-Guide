==============================================
☁️ Jenkins Pipeline – Build & Upload Artifact to AWS S3
==============================================

📌 PURPOSE
- Build application artifact
- Upload artifact to AWS S3
- Maintain versioned build storage

🔐 PREREQUISITES
- AWS CLI installed on Jenkins agent
- IAM user with S3 permissions
- AWS credentials configured in Jenkins

----------------------------------------------
🧾 JENKINS PIPELINE CODE (WITH COMMENTS)
----------------------------------------------

pipeline {
    agent any                     // Execute on any Jenkins agent

    environment {
        AWS_REGION    = "ap-south-1"            // AWS region
        S3_BUCKET     = "my-ci-artifact-bucket" // S3 bucket name
        ARTIFACT_DIR  = "target"                // Build output directory
        ARTIFACT_NAME = "app.jar"                // Artifact file name
    }

    stages {

        stage('Checkout Code') {
            steps {
                // Fetch source code from Git repository
                checkout scm
            }
        }

        stage('Build Application') {
            steps {
                script {
                    // Build project (example: Maven project)
                    sh "mvn clean package"
                }
            }
        }

        stage('Upload Artifact to S3') {
            steps {
                script {
                    // Upload artifact to S3 with job & build versioning
                    sh """
                    aws s3 cp ${ARTIFACT_DIR}/${ARTIFACT_NAME} \
                    s3://${S3_BUCKET}/${JOB_NAME}/${BUILD_NUMBER}/${ARTIFACT_NAME}
                    """
                }
            }
        }
    }

    post {
        success {
            echo "✅ Artifact uploaded successfully to AWS S3"
        }
        failure {
            echo "❌ Artifact upload failed"
        }
    }
}

----------------------------------------------
🧠 EXPLANATION
----------------------------------------------
- Checkout Code: Pulls latest source
- Build Application: Generates artifact
- Upload Artifact: Stores artifact in S3
- Versioning: Uses JOB_NAME & BUILD_NUMBER

----------------------------------------------
📦 S3 PATH FORMAT
----------------------------------------------
s3://bucket-name/job-name/build-number/artifact-name

----------------------------------------------
🤝 CONTRIBUTE
----------------------------------------------
Add more commands, diagrams, or revision notes to help learners revise Docker faster.

----------------------------------------------
👨‍💻 AUTHOR
----------------------------------------------
Aditya Jadhav  
Beginner Cloud & DevOps Learner  

📧 adijadhav8446@gmail.com  
🌐 https://github.com/AdiJadhav1608  
🔗 https://www.linkedin.com/in/aditya-jadhav-718087339/  

⭐ If you found this helpful, give it a star and keep learning Kubernetes!
