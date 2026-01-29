# 🔐 Jenkins SCM Credentials Configuration

---

## 📌 Why Credentials Matter?
Credentials allow Jenkins to securely access **private repositories** without exposing secrets.

---

## 🔑 Supported Credential Types
- Username & Password
- SSH Private Key
- GitHub Personal Access Token (PAT)

---

## ⚙️ Where to Configure
- Jenkins Dashboard → Manage Jenkins
- Credentials → Global / Folder level

---

## ✅ Best Practices
- Use least-privilege access
- Rotate tokens regularly
- Never hardcode secrets in Jenkinsfile
