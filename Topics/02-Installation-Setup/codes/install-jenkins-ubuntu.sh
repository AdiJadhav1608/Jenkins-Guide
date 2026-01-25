#!/bin/bash
# ---------------------------------------------
# Jenkins Installation Script for Ubuntu
# ---------------------------------------------

# Update system packages
sudo apt update -y

# Install Java (Jenkins dependency)
sudo apt install openjdk-11-jdk -y

# Add Jenkins GPG key
curl -fsSL https://pkg.jenkins.io/debian/jenkins.io.key | sudo tee \
  /usr/share/keyrings/jenkins-keyring.asc > /dev/null

# Add Jenkins repository
echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] \
  https://pkg.jenkins.io/debian binary/ | sudo tee \
  /etc/apt/sources.list.d/jenkins.list > /dev/null

# Update package list again
sudo apt update -y

# Install Jenkins
sudo apt install jenkins -y

# Start Jenkins service
sudo systemctl start jenkins

# Enable Jenkins on boot
sudo systemctl enable jenkins

# Check Jenkins status
sudo systemctl status jenkins
