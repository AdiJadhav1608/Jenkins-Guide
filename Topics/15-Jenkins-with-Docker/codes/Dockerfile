# ===========================================
# 🐳 DOCKERFILE FOR SAMPLE APPLICATION
# ===========================================

# 🔹 Base image
FROM python:3.10-slim

# 🔹 Set working directory
WORKDIR /app

# 🔹 Copy application files
COPY . .

# 🔹 Install dependencies
RUN pip install --no-cache-dir -r requirements.txt

# 🔹 Expose application port
EXPOSE 5000

# 🔹 Run application
CMD ["python", "app.py"]

# -------------------------------------------
# 🧠 EXPLANATION
# -------------------------------------------
# FROM        → Base Python image
# WORKDIR     → Sets container directory
# COPY        → Copies app files
# RUN         → Installs dependencies
# EXPOSE      → Documents app port
# CMD         → Starts application
#
# ✔ Lightweight image
# ✔ Production-ready structure
