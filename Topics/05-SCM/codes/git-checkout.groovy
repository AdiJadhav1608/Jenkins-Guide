pipeline {
    agent any

    stages {
        stage('Checkout Source Code') {
            steps {
                // Checkout code from Git repository
                git branch: 'main',
                    url: 'https://github.com/your-org/your-repo.git'
            }
        }
    }
}


