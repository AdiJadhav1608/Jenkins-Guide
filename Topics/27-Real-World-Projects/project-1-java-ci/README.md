# ☕ Project 1 – Java CI Pipeline using Jenkins

## 🎯 Project Overview
This project demonstrates a **Continuous Integration (CI) pipeline** for a Java application using Jenkins.

Whenever code is pushed to GitHub, Jenkins will:
- Pull source code
- Build the Java application using Maven
- Run tests
- Generate build artifacts

This is a beginner-friendly real-world CI project for DevOps freshers.

---

# 🏗️ Architecture Workflow
GitHub → Jenkins → Maven Build → Test → Artifact

---

# 📌 Tools & Technologies Used

- Jenkins (CI Server)
- Git & GitHub
- Maven (Build Tool)
- Java (Application)
- Linux (Execution Environment)

---

# 🚀 Pipeline Stages Explanation

## 🔹 Stage 1: Checkout
Pulls source code from GitHub repository.

## 🔹 Stage 2: Build
Compiles the Java project using Maven.

## 🔹 Stage 3: Test
Runs unit tests automatically.

## 🔹 Stage 4: Archive Artifacts
Stores the generated JAR file for deployment use.

---

# ▶️ How to Run This Project

### Step 1: Create a Jenkins Pipeline Job
- Go to Jenkins Dashboard
- Click "New Item"
- Select Pipeline

### Step 2: Add GitHub Repository
Configure SCM → Git → Add repo URL

### Step 3: Add Jenkinsfile Path
```
Jenkinsfile
```

### Step 4: Click Build Now 🚀

---

# 💼 Real-World Use Case
Used in companies to automatically build Java applications after every code commit, ensuring faster and error-free integration.

---

# 🤝 Contribute
Feel free to fork and enhance this CI pipeline.

---

# 👨‍💻 Author
**Aditya Jadhav**  
Beginner Cloud & DevOps Learner  
📧 adijadhav8446@gmail.com  
🌐 GitHub: https://github.com/AdiJadhav1608  
🔗 LinkedIn: https://www.linkedin.com/in/aditya-jadhav-718087339/