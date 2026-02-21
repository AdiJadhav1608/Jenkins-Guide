# Use official Nginx base image
# This image is lightweight and commonly used for web app deployment
FROM nginx:alpine

# Copy application files to Nginx web directory
# This assumes you have an index.html or web app files
COPY . /usr/share/nginx/html

# Expose port 80 for web traffic
EXPOSE 80

# Start Nginx server in foreground mode
CMD ["nginx", "-g", "daemon off;"]