# 🔐 19 - Jenkins Security & Role-Based Authorization

---

## 📌 Introduction

Security in Jenkins is one of the most critical aspects of CI/CD pipelines.  
Without proper security configuration, anyone can:

- Modify pipelines
- Access credentials
- Trigger production deployments
- View sensitive logs
- Change system configurations

This module covers:

✔ Enabling Security  
✔ Authentication Methods  
✔ Authorization Strategies  
✔ Role-Based Access Control (RBAC)  
✔ Best Security Practices  

---

# 🛡 1️⃣ Enabling Jenkins Security

By default, Jenkins may run without authentication (especially in local setups).

### 🔹 Enable Security:

1. Go to:
   ```
   Manage Jenkins → Security → Configure Global Security
   ```

2. Enable:
   ```
   ☑ Enable Security
   ```

---

# 👤 2️⃣ Authentication Methods

Authentication verifies **who the user is**.

### Common Authentication Options:

| Method | Description |
|--------|------------|
| Jenkins’ own user database | Simple local user system |
| LDAP | Enterprise directory |
| GitHub OAuth | Login via GitHub |
| Active Directory | Corporate environment |

---

# 🔑 3️⃣ Authorization Strategies

Authorization defines **what a user can do**.

### Available Strategies:

- Anyone can do anything (❌ Not recommended)
- Logged-in users can do anything
- Matrix-based security
- Project-based Matrix
- Role-Based Strategy (Recommended ✅)

---

# 🎯 4️⃣ Role-Based Authorization Strategy (RBAC)

RBAC allows:

✔ Assigning roles  
✔ Defining permissions  
✔ Mapping users to roles  
✔ Restricting job access  

---

## 📦 Step 1: Install Plugin

Go to:

```
Manage Jenkins → Manage Plugins → Available Plugins
```

Search and install:

```
Role-Based Authorization Strategy
```

Restart Jenkins.

---

## 📦 Step 2: Configure Role-Based Strategy

Go to:

```
Manage Jenkins → Security → Configure Global Security
```

Select:

```
Authorization → Role-Based Strategy
```

Save.

---

## 📦 Step 3: Manage Roles

Go to:

```
Manage Jenkins → Manage and Assign Roles
```

You will see:

- Manage Roles
- Assign Roles

---

# 🧩 Role Types

### 🔹 Global Roles
Control overall Jenkins permissions.

Example roles:

- Admin
- Developer
- Viewer

### 🔹 Project Roles
Control access to specific jobs.

Example:

- Can build only `dev-*` jobs
- Can view only `frontend-*` jobs

---

# 🛠 Example Role Setup

### 👑 Admin Role
Permissions:
- Overall/Administer
- Job/Create
- Job/Delete
- Credentials/View
- Credentials/Create

### 👨‍💻 Developer Role
Permissions:
- Job/Build
- Job/Read
- Job/Workspace
- SCM/Tag

### 👀 Viewer Role
Permissions:
- Job/Read
- View/Read

---

# 🔐 5️⃣ Best Practices for Jenkins Security

## ✅ Always Enable Authentication

Never run production Jenkins without login.

---

## ✅ Use HTTPS

Configure Jenkins behind:

- Nginx
- Apache
- Load Balancer

Use SSL certificate.

---

## ✅ Limit Admin Access

Avoid giving Admin role to everyone.

---

## ✅ Secure Credentials

Use:

```
Manage Jenkins → Credentials
```

Never hardcode:

- AWS keys
- Docker passwords
- GitHub tokens

---

## ✅ Enable CSRF Protection

Keep:

```
Prevent Cross Site Request Forgery exploits
```

Enabled.

---

## ✅ Use Backup Strategy

Backup:

- Jenkins home
- Credentials
- Plugins
- Config files

---

# 📂 Folder Structure Explanation

```
19-Security/
│── README.md
│── configs/
│    └── role-strategy.md
```

- README.md → Complete security documentation
- configs/role-strategy.md → Role configuration reference

---

# 🚀 Why Security is Important in DevOps

In real companies:

- Multiple teams use Jenkins
- Production pipelines run automatically
- Cloud credentials are stored
- Deployment happens via Jenkins

If misconfigured:

⚠ Production can break  
⚠ Secrets can leak  
⚠ Unauthorized deployments can happen  

Security is not optional — it is mandatory.

---

----------------------------------------------
🤝 CONTRIBUTE
----------------------------------------------
Add more security hardening techniques, production security tips, or enterprise-level authentication setups to improve this repository.

----------------------------------------------
👨‍💻 AUTHOR
----------------------------------------------
Aditya Jadhav  
Beginner Cloud & DevOps Learner  

📧 adijadhav8446@gmail.com  
🌐 https://github.com/AdiJadhav1608  
🔗 https://www.linkedin.com/in/aditya-jadhav-718087339/  

⭐ If this helped you, give this repo a star!