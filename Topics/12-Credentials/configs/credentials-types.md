# 🔑 Types of Jenkins Credentials

Jenkins supports multiple credential types
to handle different authentication needs.

---

## 🔐 Common Credential Types

• Username & Password  
• SSH Username with Private Key  
• Secret Text (API Tokens)  
• Certificates  

---

## 🧩 When to Use What?

Username/Password → Git, HTTP services  
SSH Key           → Remote servers  
Secret Text       → Tokens, API keys  
Certificates      → Secure communication  

---

## 📌 Best Practices

✔ Use least privilege  
✔ Rotate credentials regularly  
✔ Avoid hardcoding secrets  
✔ Use credentials binding  

