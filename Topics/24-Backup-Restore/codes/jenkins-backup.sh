#!/bin/bash

# =========================================================
# 💾 Jenkins Backup Script (Production Ready)
# =========================================================
# Purpose:
# - Create automated backup of Jenkins Home Directory
# - Compress backup with timestamp
# - Store backups safely for disaster recovery
#
# Default Jenkins Home (Linux):
# /var/lib/jenkins
# =========================================================

# Jenkins home directory (change if custom path)
JENKINS_HOME="/var/lib/jenkins"

# Backup storage location (recommended: external disk or backup server)
BACKUP_DIR="/opt/jenkins-backups"

# Current date and time for unique backup naming
DATE=$(date +%Y-%m-%d_%H-%M-%S)

# Backup file name with timestamp
BACKUP_FILE="jenkins-backup-$DATE.tar.gz"

# =========================================================
# Step 1: Create Backup Directory (if not exists)
# =========================================================
echo "Creating backup directory if not exists..."
mkdir -p $BACKUP_DIR

# =========================================================
# Step 2: Stop Jenkins (Optional but Recommended)
# Prevents data corruption during backup
# =========================================================
echo "Stopping Jenkins service..."
sudo systemctl stop jenkins

# =========================================================
# Step 3: Create Compressed Backup Archive
# - z : gzip compression
# - c : create archive
# - v : verbose output
# - f : filename
# =========================================================
echo "Starting Jenkins backup..."
sudo tar -zcvf $BACKUP_DIR/$BACKUP_FILE $JENKINS_HOME

# =========================================================
# Step 4: Start Jenkins Again
# =========================================================
echo "Starting Jenkins service..."
sudo systemctl start jenkins

# =========================================================
# Step 5: Backup Completion Message
# =========================================================
echo "Backup completed successfully!"
echo "Backup stored at: $BACKUP_DIR/$BACKUP_FILE"

# =========================================================
# Optional: Delete Backups Older Than 7 Days (Auto Cleanup)
# =========================================================
echo "Cleaning old backups (older than 7 days)..."
find $BACKUP_DIR -type f -name "*.tar.gz" -mtime +7 -exec rm -f {} \;

echo "Old backups cleaned successfully."

# =========================================================
# 🔐 Production Recommendations:
# - Schedule this script using cron (daily backup)
# - Store backups in remote storage (S3/NAS)
# - Encrypt sensitive backup files
# =========================================================
