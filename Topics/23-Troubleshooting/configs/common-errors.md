# ❗ Common Jenkins Errors & Solutions (Configuration Reference)

---

# 🚨 1️⃣ Error: “No such DSL method found”

## 🔍 Cause:
- Missing plugin
- Wrong pipeline syntax
- Unsupported step in Jenkinsfile

## 🛠 Fix:
✔ Install required plugin  
✔ Verify pipeline syntax  
✔ Use correct declarative/scripted syntax  

---

# 🚨 2️⃣ Error: “Permission Denied”

## 🔍 Cause:
- Incorrect file permissions
- Agent user lacks access
- Credential scope issue

## 🛠 Fix:
```
chmod +x script.sh
chown jenkins:jenkins file
```
Also verify credentials in Jenkins credentials store.

---

# 🚨 3️⃣ Error: “Agent is Offline”

## 🔍 Cause:
- Network connectivity issue
- Agent service stopped
- Disk full on agent machine

## 🛠 Fix:
✔ Reconnect agent node  
✔ Check agent logs  
✔ Restart agent service  

---

# 🚨 4️⃣ Error: “Git Authentication Failed”

## 🔍 Cause:
- Invalid SSH key
- Expired access token
- Wrong repository URL

## 🛠 Fix:
✔ Regenerate GitHub token  
✔ Add SSH key to Jenkins  
✔ Verify repository access permissions  

---

# 🚨 5️⃣ Error: “OutOfMemoryError: Java heap space”

## 🔍 Cause:
- Low JVM memory allocation
- Large builds/logs
- Too many concurrent jobs

## 🛠 Fix:
Update Jenkins JVM options:
```
-Xms2g
-Xmx4g
```
Restart Jenkins after changes.

---

# 🚨 6️⃣ Error: “Plugin Dependency Errors”

## 🔍 Cause:
- Incompatible plugin versions
- Corrupt plugin update

## 🛠 Fix:
✔ Update plugins carefully  
✔ Rollback problematic plugin  
✔ Restart Jenkins safely  

---

# 🚨 7️⃣ Error: “Build Stuck in Queue”

## 🔍 Cause:
- No available executors
- Agent label mismatch
- Node resource exhaustion

## 🛠 Fix:
✔ Increase executors  
✔ Check node labels  
✔ Add additional agents  

---

# 🚨 8️⃣ Error: “Workspace Permission Issues”

## 🔍 Cause:
- Incorrect workspace ownership
- Manual file changes
- OS permission conflicts

## 🛠 Fix:
```
sudo chown -R jenkins:jenkins /var/lib/jenkins/workspace
```

---

# 🧠 Final Debugging Checklist (DevOps Ready)

✔ Check Console Output first  
✔ Verify plugins & versions  
✔ Validate credentials & tokens  
✔ Check agent/node status  
✔ Review system logs  
✔ Monitor CPU, RAM & disk usage  

🔧 Fast Debugging = Reliable CI/CD Pipeline 🚀
