╔══════════════════════════════════════════════════════════════════╗
║ 🚀 17 – Jenkins with Cloud (AWS Integration)                     ║
╚══════════════════════════════════════════════════════════════════╝

🔗 **Objective**
  
This module explains how Jenkins integrates with **AWS Cloud services** to perform real-world CI/CD tasks such as:
  
• Pushing Docker images to **AWS ECR**
• Uploading build artifacts to **Amazon S3**
• Managing credentials securely inside Jenkins
• Automating cloud-native delivery pipelines

This is a **production-oriented Jenkins + AWS setup**, widely used in DevOps roles.


════════════════════════════════════════════════════════════════════
🔧 AWS SERVICES USED
════════════════════════════════════════════════════════════════════

☁️ **Amazon ECR (Elastic Container Registry)**  
• Stores Docker images securely  
• Used for containerized deployments  

☁️ **Amazon S3 (Simple Storage Service)**  
• Stores build artifacts  
• Used for backups, reports, binaries, logs  

☁️ **IAM (Identity and Access Management)**  
• Provides secure access using roles or users  
• Avoids hard-coding AWS credentials  


════════════════════════════════════════════════════════════════════
📁 DIRECTORY STRUCTURE
════════════════════════════════════════════════════════════════════

17-Jenkins-with-Cloud/
│
├── README.md
│
├── codes/
│   ├── aws-ecr-push.groovy
│   └── s3-artifact-upload.groovy


════════════════════════════════════════════════════════════════════
🧩 PIPELINE 1 – AWS ECR IMAGE PUSH
════════════════════════════════════════════════════════════════════

📄 **File:** `aws-ecr-push.groovy`

🎯 **Purpose**
  
This Jenkins pipeline:
  
• Builds a Docker image  
• Authenticates with AWS ECR  
• Tags the image properly  
• Pushes the image to ECR  

This is used when deploying applications to:
  
• ECS  
• EKS  
• Kubernetes clusters  


────────────────────────────────────────────────────────────────────
🔹 STAGE-WISE EXPLANATION
────────────────────────────────────────────────────────────────────

🔸 **Stage 1 – Checkout Source Code**
  
• Pulls application code from Git repository  
• Ensures Jenkins works with the latest commit  

🔸 **Stage 2 – AWS Authentication**
  
• Uses AWS CLI inside Jenkins  
• Logs in to ECR using:
  
  `aws ecr get-login-password`
  
• Authentication is token-based and secure  

🔸 **Stage 3 – Docker Build**
  
• Builds Docker image using Dockerfile  
• Image is created locally on Jenkins agent  

🔸 **Stage 4 – Docker Tagging**
  
• Tags image in ECR format:
  
  `<account-id>.dkr.ecr.<region>.amazonaws.com/repo:tag`

🔸 **Stage 5 – Docker Push**
  
• Pushes tagged image to AWS ECR  
• Image becomes available for deployments  


────────────────────────────────────────────────────────────────────
🔐 CREDENTIAL MANAGEMENT (IMPORTANT)
────────────────────────────────────────────────────────────────────

✔️ AWS credentials are stored in:
  
• Jenkins → Manage Credentials  
• As **AWS Access Key & Secret Key**

✔️ No hard-coded secrets inside pipeline  

✔️ IAM user should have permissions:
  
• AmazonEC2ContainerRegistryFullAccess  


════════════════════════════════════════════════════════════════════
🧩 PIPELINE 2 – S3 ARTIFACT UPLOAD
════════════════════════════════════════════════════════════════════

📄 **File:** `s3-artifact-upload.groovy`

🎯 **Purpose**
  
This pipeline:
  
• Builds application artifacts  
• Uploads them to an S3 bucket  
• Maintains versioned storage  

Used for:
  
• Storing JAR/WAR files  
• Build reports  
• Logs and backups  


────────────────────────────────────────────────────────────────────
🔹 STAGE-WISE EXPLANATION
────────────────────────────────────────────────────────────────────

🔸 **Stage 1 – Code Checkout**
  
• Retrieves application source code  

🔸 **Stage 2 – Build Artifact**
  
• Runs build commands (Maven/Gradle/npm)  
• Generates final artifact (example: `.jar`)  

🔸 **Stage 3 – S3 Upload**
  
• Uses AWS CLI:
  
  `aws s3 cp`
  
• Uploads artifact to specified S3 bucket  
• Supports folders and versioning  

🔸 **Stage 4 – Verification**
  
• Confirms upload success  
• Can be extended with notifications  


────────────────────────────────────────────────────────────────────
🔐 S3 SECURITY & ACCESS
────────────────────────────────────────────────────────────────────

✔️ Jenkins uses IAM credentials  

✔️ IAM permissions required:
  
• AmazonS3FullAccess (or limited bucket access)

✔️ Bucket policies can restrict access further  


════════════════════════════════════════════════════════════════════
✅ REAL-WORLD USE CASES
════════════════════════════════════════════════════════════════════

✔️ Jenkins → ECR → ECS deployment  
✔️ Jenkins → ECR → Kubernetes  
✔️ Jenkins → S3 artifact repository  
✔️ Backup CI builds to cloud storage  
✔️ Secure cloud-native CI/CD pipelines  


════════════════════════════════════════════════════════════════════
⚠️ BEST PRACTICES
════════════════════════════════════════════════════════════════════

✔️ Use IAM Roles instead of access keys (if on EC2)  
✔️ Enable S3 versioning  
✔️ Tag Docker images using build numbers  
✔️ Avoid storing secrets in Git  
✔️ Use least-privilege IAM policies  


════════════════════════════════════════════════════════════════════
🤝 Contribute
════════════════════════════════════════════════════════════════════

Contributions are welcome!  
If you find improvements or want to add enhancements, feel free to fork the repository and submit a pull request.


════════════════════════════════════════════════════════════════════
👤 Author
════════════════════════════════════════════════════════════════════

**Aditya Jadhav**  
Beginner Cloud & DevOps Learner  

📧 Email: adijadhav8446@gmail.com  
🌐 GitHub: https://github.com/AdiJadhav1608  
🔗 LinkedIn: https://www.linkedin.com/in/aditya-jadhav-718087339/
