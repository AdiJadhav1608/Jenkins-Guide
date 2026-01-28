# 🧱 Jenkins — Jobs & Project Types (Day 4)

---

## 🎯 Objective
This section explains **Jenkins jobs**, different **project types**, and when to use each one in real-world CI/CD pipelines.

You will learn:
- What a Jenkins job is
- Types of Jenkins projects
- Differences between job types
- Practical use cases

---

## 🧩 What is a Jenkins Job?
A Jenkins Job is a **task or project** that Jenkins executes automatically.

A job can:
- Pull code from a repository
- Build the application
- Run tests
- Deploy artifacts

Each job runs as a **build**, and Jenkins keeps its history.

---

## 🗂️ Common Jenkins Project Types
### 🔹 Freestyle Project
- Simple and UI-based
- Easy to configure
- Best for beginners and quick tasks

### 🔹 Pipeline Project
- Defined using a `Jenkinsfile`
- Pipeline as Code approach
- Preferred in real projects

### 🔹 Multibranch Pipeline
- Automatically detects branches
- Runs pipeline for each branch
- Ideal for Git-based workflows

### 🔹 Folder Project
- Organizes jobs into folders
- Improves readability and access control

---

## ⚖️ When to Use Which Job?
- 🧪 Learning / PoC → **Freestyle**
- 🚀 Production CI/CD → **Pipeline**
- 🌿 Git branching strategy → **Multibranch Pipeline**

---

## 💡 Best Practices
- Prefer **Pipeline jobs** over Freestyle
- Store pipelines in **version control**
- Use **parameters** for flexibility
- Group jobs using **folders**

---

# 🤝 Contribute
Add more commands, diagrams, or revision notes to help learners revise Docker faster.

---

# 👨‍💻 Author
**Aditya Jadhav**  
Beginner Cloud & DevOps Learner  

📧 **adijadhav8446@gmail.com**  
🌐 **GitHub Profile:** https://github.com/AdiJadhav1608  
🔗 **LinkedIn:** https://www.linkedin.com/in/aditya-jadhav-718087339/  

⭐ *If you found this helpful, give it a star and keep learning Kubernetes !*
