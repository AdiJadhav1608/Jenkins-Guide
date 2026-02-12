# 🔐 Role-Based Strategy Configuration Reference

This file explains how roles should be structured inside Jenkins.

---

# 👑 Global Roles

## 1️⃣ Admin

Pattern: `.*`  
Permissions:
- Overall/Administer
- Overall/Read
- Job/Create
- Job/Delete
- Credentials/Create
- Credentials/View
- Run/Replay

---

## 2️⃣ Developer

Pattern: `.*`  
Permissions:
- Job/Build
- Job/Read
- Job/Workspace
- SCM/Tag

---

## 3️⃣ Viewer

Pattern: `.*`  
Permissions:
- Job/Read
- View/Read

---

# 🧩 Project Roles Example

## Dev-Team Role

Pattern:
```
dev-.*
```

Permissions:
- Job/Build
- Job/Read

---

## QA-Team Role

Pattern:
```
qa-.*
```

Permissions:
- Job/Build
- Job/Read

---

# 🎯 Assignment Example

| User | Assigned Role |
|------|--------------|
| aditya | Admin |
| dev1 | Developer |
| qa1 | QA-Team |

---

# 📌 Production Recommendation

✔ Separate Admin & Dev accounts  
✔ Never use admin for daily work  
✔ Enable audit logging plugin  
✔ Rotate credentials periodically  

---

