==================================================
☸️ Jenkins with Kubernetes – Dynamic Agents Setup
==================================================

📌 OVERVIEW
This module explains how Jenkins integrates with Kubernetes
to dynamically create build agents as Pods.

Instead of static Jenkins agents, Kubernetes:
- Spins up a Pod for every build
- Executes pipeline inside container
- Automatically destroys Pod after completion

This makes CI/CD:
✔️ Scalable
✔️ Cost-efficient
✔️ Cloud-native
✔️ Production-ready

--------------------------------------------------
🏗️ ARCHITECTURE FLOW
--------------------------------------------------

Developer → Git Push → Jenkins → Kubernetes API
→ Pod Created → Build Runs → Pod Deleted

Jenkins acts as controller.
Kubernetes acts as dynamic worker provider.

--------------------------------------------------
🔑 KEY COMPONENTS
--------------------------------------------------

• Jenkins Kubernetes Plugin  
• Kubernetes Cluster (EKS / AKS / GKE / Minikube)  
• Service Account with proper RBAC  
• Pod Template YAML  
• Jenkinsfile using Kubernetes agent  

--------------------------------------------------
🚀 WHAT YOU WILL LEARN
--------------------------------------------------

1️⃣ How Jenkins creates dynamic Pods  
2️⃣ How to define Pod template  
3️⃣ How to run pipeline inside container  
4️⃣ How multi-container Pods work  
5️⃣ Best practices for cloud-native CI  

--------------------------------------------------
📁 FILES IN THIS MODULE
--------------------------------------------------

codes/
 ├── k8s-pod-template.yaml
 └── jenkinsfile-k8s.groovy

--------------------------------------------------
🔥 REAL-WORLD BENEFITS
--------------------------------------------------

✔️ No need to maintain static Jenkins agents  
✔️ Perfect for microservices  
✔️ Parallel builds using multiple Pods  
✔️ Easily integrates with Helm & GitOps  

--------------------------------------------------
🤝 Contribute
--------------------------------------------------
Add more commands, diagrams, or revision notes to help learners revise Docker faster.

---

# 👨‍💻 Author
**Aditya Jadhav**  
Beginner Cloud & DevOps Learner  

📧 **adijadhav8446@gmail.com**  
🌐 **GitHub Profile:** https://github.com/AdiJadhav1608  
🔗 **LinkedIn:** https://www.linkedin.com/in/aditya-jadhav-718087339/  

⭐ *If you found this helpful, give it a star and keep learning Kubernetes !*
