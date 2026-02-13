# 📢 20 - Jenkins Notifications (Email & Slack Integration)

---

# 📌 Introduction

In CI/CD pipelines, notifications are critical for:

✔ Build success/failure alerts  
✔ Deployment confirmation  
✔ Failure debugging  
✔ Team collaboration  
✔ Faster incident response  

Without notifications, teams won’t know when:

❌ Build fails  
❌ Tests break  
❌ Production deployment fails  

This module covers:

- 📧 Email Notifications
- 💬 Slack Notifications
- 🛠 Pipeline Groovy examples
- 🔐 Best practices

---

# 📧 1️⃣ Email Notifications in Jenkins

Jenkins supports email alerts via:

- Built-in Mailer plugin
- Email Extension Plugin (Recommended ✅)

---

## 🔹 Step 1: Install Email Extension Plugin

Go to:

```
Manage Jenkins → Manage Plugins → Available Plugins
```

Search:

```
Email Extension Plugin
```

Install and restart Jenkins.

---

## 🔹 Step 2: Configure SMTP

Go to:

```
Manage Jenkins → Configure System
```

Scroll to:

```
Extended E-mail Notification
```

Example (Gmail SMTP):

- SMTP Server: `smtp.gmail.com`
- Port: `587`
- Use TLS: ✅
- Authentication: Your email + App password

⚠ Never hardcode passwords in pipeline.

---

# 💬 2️⃣ Slack Notifications in Jenkins

Slack integration allows real-time team alerts.

---

## 🔹 Step 1: Install Slack Plugin

Go to:

```
Manage Jenkins → Manage Plugins → Available Plugins
```

Search:

```
Slack Notification Plugin
```

Install and restart.

---

## 🔹 Step 2: Configure Slack Workspace

1. Create Slack App
2. Enable Incoming Webhook
3. Copy Webhook URL
4. Add to Jenkins credentials

---

# 📦 Folder Structure

```
20-Notifications/
│── README.md
│── codes/
│    ├── email-notification.groovy
│    └── slack-notification.groovy
```

- README.md → Documentation
- codes/ → Pipeline script examples

---

# 📧 Email Notification Pipeline Example

See:

```
codes/email-notification.groovy
```

This example sends email on:

- SUCCESS
- FAILURE

---

# 💬 Slack Notification Pipeline Example

See:

```
codes/slack-notification.groovy
```

This example sends Slack alerts on:

- Build Started
- Success
- Failure

---

# 🔐 Best Practices

## ✅ Use Credentials Store

Store:
- SMTP password
- Slack webhook
- API tokens

Never expose them in Jenkinsfile.

---

## ✅ Notify Only Required Events

Avoid spam notifications.

Send alerts only for:

- Failed builds
- Deployment success
- Critical events

---

## ✅ Use Environment Information

Include:

- Job name
- Build number
- Build URL
- Commit ID
- Branch name

---

# 🚀 Why Notifications Matter in DevOps

In real production environments:

- CI pipelines run automatically
- Multiple teams depend on builds
- Fast failure detection is crucial

Notifications ensure:

✔ Transparency  
✔ Accountability  
✔ Faster debugging  
✔ Strong DevOps collaboration  

---

----------------------------------------------
🤝 CONTRIBUTE
----------------------------------------------
Add Microsoft Teams, Discord, or advanced notification integrations to improve this repository.

----------------------------------------------
👨‍💻 AUTHOR
----------------------------------------------
Aditya Jadhav  
Beginner Cloud & DevOps Learner  

📧 adijadhav8446@gmail.com  
🌐 https://github.com/AdiJadhav1608  
🔗 https://www.linkedin.com/in/aditya-jadhav-718087339/  

⭐ If this helped you, give this repo a star!
