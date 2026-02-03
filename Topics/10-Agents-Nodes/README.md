# 🚀 Jenkins Agents & Nodes

Agents and Nodes define **WHERE** a Jenkins job or pipeline runs.
They are critical for scaling, isolation, and performance.

---

## 🔑 What is a Jenkins Node?

A Node is a machine (VM / server / container) connected to Jenkins
that executes jobs.

✔ Can be Master or Agent  
✔ Runs build steps  
✔ Provides execution environment  

---

## 🤖 What is a Jenkins Agent?

An Agent is a **worker node** that runs jobs assigned by Jenkins.

✔ Reduces load on master  
✔ Enables parallel builds  
✔ Supports different OS & tools  

---

## 🧩 Agent Allocation Methods

• Any available agent  
• Label-based agent  
• SSH-connected agent  
• Docker-based agent  

---

## ⚙️ Why Agents Matter?

✔ Faster builds  
✔ Better resource utilization  
✔ Isolated environments  
✔ Production-grade CI/CD  

---

## 📂 Folder Overview

• `ssh-agent-config.groovy` → SSH-based agent usage  
• `docker-agent.groovy` → Docker container as agent  
• `label-based-agent.groovy` → Label-restricted agent  

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
