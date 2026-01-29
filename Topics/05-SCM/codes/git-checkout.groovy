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


🧠 Detailed Explanation

pipeline {} → Declarative pipeline syntax

agent any → Run on any available Jenkins agent

stage('Checkout Source Code') → Logical step name

git step:

branch → Branch to checkout

url → Git repository URL

✅ Jenkins automatically:

Clones the repository

Places code inside the workspace

Tracks commit history for builds