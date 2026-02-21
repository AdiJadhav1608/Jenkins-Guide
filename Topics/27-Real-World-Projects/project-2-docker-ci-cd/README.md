# 🐳 Project 2 – Docker CI/CD Pipeline using Jenkins

## 🎯 Project Overview
This project demonstrates a **CI/CD pipeline with Docker** where Jenkins:
- Builds a Docker image
- Pushes it to Docker Hub
- Deploys the container automatically

This is a real-world DevOps pipeline used in modern companies.

---

# 🏗️ Workflow Architecture
GitHub → Jenkins → Build Docker Image → Push to DockerHub → Deploy Container

---

# 🛠️ Tools & Technologies

- Jenkins
- Docker
- DockerHub
- GitHub
- Linux Shell

---

# 🚀 Pipeline Stages

## 🔹 Checkout Code
Fetch latest application source code.

## 🔹 Build Docker Image
Creates a container image using Dockerfile.

## 🔹 Push to DockerHub
Uploads the image to Docker registry.

## 🔹 Deploy Container
Runs the container in production environment.

---

# 🔐 Important Setup (Before Running)

Add these credentials in Jenkins:
- DockerHub Username
- DockerHub Password (as Credentials ID)

---

# 💼 Real-World Use Case
Used in startups and enterprises for automated container deployment and microservices CI/CD pipelines.

---

# 👨‍💻 Author
**Aditya Jadhav**  
Beginner Cloud & DevOps Learner  
📧 adijadhav8446@gmail.com  
🌐 GitHub: https://github.com/AdiJadhav1608  
🔗 LinkedIn: https://www.linkedin.com/in/aditya-jadhav-718087339/