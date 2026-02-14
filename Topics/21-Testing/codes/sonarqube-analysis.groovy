/*
=========================================================
🔍 Jenkins SonarQube Analysis Pipeline
=========================================================

Purpose:
- Perform static code analysis
- Detect bugs, vulnerabilities, and code smells
- Enforce code quality standards
- Integrate Quality Gates in CI/CD

Plugin Required:
- SonarQube Scanner Plugin
- SonarQube Server configured in Jenkins
=========================================================
*/

pipeline {

    // Run pipeline on any available Jenkins agent
    agent any

    tools {
        // Uses configured SonarQube scanner tool from Jenkins Global Tool Configuration
        sonarScanner 'SonarQubeScanner'
    }

    stages {

        // -----------------------------------
        // Stage 1: Checkout Code
        // -----------------------------------
        stage('Checkout') {
            steps {
                echo "Cloning source code from repository..."
                // Example:
                // git branch: 'main', url: 'https://github.com/your-repo.git'
            }
        }

        // -----------------------------------
        // Stage 2: Build Project
        // -----------------------------------
        stage('Build') {
            steps {
                echo "Building project before analysis..."
                // Example:
                // sh 'mvn clean compile'
            }
        }

        // -----------------------------------
        // Stage 3: SonarQube Code Analysis
        // -----------------------------------
        stage('SonarQube Analysis') {
            steps {

                // Connects pipeline with configured SonarQube server
                withSonarQubeEnv('SonarQube-Server') {

                    /*
                    Runs SonarQube scanner with project details.
                    Replace projectKey and projectName as per your project.
                    */

                    sh '''
                    sonar-scanner \
                    -Dsonar.projectKey=my-project \
                    -Dsonar.projectName="My Project" \
                    -Dsonar.sources=. \
                    -Dsonar.host.url=http://localhost:9000 \
                    -Dsonar.login=${SONAR_AUTH_TOKEN}
                    '''
                }
            }
        }

        // -----------------------------------
        // Stage 4: Quality Gate Check
        // -----------------------------------
        stage('Quality Gate') {
            steps {

                /*
                Waits for SonarQube Quality Gate result.
                If gate fails, pipeline can be stopped to prevent bad deployments.
                */

                timeout(time: 5, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }

    post {

        success {
            echo "Code Quality Check Passed ✅ Ready for deployment."
        }

        failure {
            echo "Quality Gate Failed ❌ Fix code issues before deployment."
        }
    }
}

/*
=========================================================
📊 SonarQube Metrics Generated
=========================================================

✔ Code Coverage
✔ Bugs & Vulnerabilities
✔ Code Smells
✔ Duplications
✔ Maintainability Rating

=========================================================
🔐 Production Best Practices
=========================================================

✔ Store SONAR_AUTH_TOKEN in Jenkins Credentials
✔ Never hardcode tokens in pipeline
✔ Use Quality Gates before production deployment
✔ Integrate with GitHub PR checks for better code quality
=========================================================
*/
