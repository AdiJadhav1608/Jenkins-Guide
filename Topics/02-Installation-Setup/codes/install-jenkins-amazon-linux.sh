#!/bin/bash
# ---------------------------------------------
# Jenkins Installation Script for Amazon Linux
# ---------------------------------------------

# Update system
sudo yum update -y

# Install Java
sudo yum install java-11-amazon-corretto -y

# Add Jenkins repository
sudo wget -O /etc/yum.repos.d/jenkins.repo \
  https://pkg.jenkins.io/redhat-stable/jenkins.repo

# Import Jenkins key
sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io.key

# Install Jenkins
sudo yum install jenkins -y

# Start Jenkins service
sudo systemctl start jenkins

# Enable Jenkins on boot
sudo systemctl enable jenkins

# Check status
sudo systemctl status jenkins
