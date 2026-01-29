# 🔗 Jenkins — Source Code Management (SCM) (Day 5)

---

## 🎯 Objective
Source Code Management (SCM) is the **foundation of CI/CD**.  
In this section, you will understand how Jenkins connects with **Git-based repositories** and triggers builds automatically.

You will learn:
- What SCM means in Jenkins
- How Jenkins pulls code from Git
- Webhooks vs polling
- Secure access using credentials

---

## 🧩 What is SCM in Jenkins?
SCM allows Jenkins to:
- 📥 Fetch source code from repositories
- 🔄 Track code changes
- 🪝 Trigger builds automatically on commits

Common SCM tools:
- GitHub
- GitLab
- Bitbucket

---

## 🔌 Git Integration in Jenkins
Jenkins uses the **Git plugin** to:
- Clone repositories
- Checkout branches
- Track commit history

You must configure:
- Repository URL
- Branch
- Credentials (if private repo)

---

## 🪝 Webhooks vs Poll SCM
### 🔹 Webhooks (Recommended)
- Git provider notifies Jenkins instantly
- Faster and efficient
- No unnecessary polling

### 🔹 Poll SCM
- Jenkins checks repo at fixed intervals
- Uses Cron syntax
- Not ideal for large projects

---

## 🔐 SCM Credentials (Important)
Jenkins supports:
- Username & Password
- SSH keys
- Personal Access Tokens (PAT)

✅ Always store secrets using **Jenkins Credentials Manager**.

---

## 💡 Best Practices
- Use **webhooks** instead of polling
- Store pipelines as code (`Jenkinsfile`)
- Never hardcode credentials
- Use separate credentials per environment

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
