/*
=========================================================
🧪 Jenkins JUnit Testing Pipeline
=========================================================

Purpose:
- Run automated unit tests
- Publish JUnit test reports in Jenkins
- Mark build unstable if tests fail

Common Tools That Generate JUnit Reports:
- Maven
- Gradle
- PyTest (XML format)
- Jest (JUnit reporter)

Plugin Required:
- JUnit Plugin (comes pre-installed in most Jenkins setups)
=========================================================
*/

pipeline {

    // Defines execution agent (any available Jenkins node)
    agent any

    stages {

        // -----------------------------------
        // Stage 1: Checkout Source Code
        // -----------------------------------
        stage('Checkout') {
            steps {
                // Pulls code from configured SCM (GitHub/Git)
                echo "Checking out source code..."
                // Example: git url: 'https://github.com/your-repo.git'
            }
        }

        // -----------------------------------
        // Stage 2: Build Application
        // -----------------------------------
        stage('Build') {
            steps {
                // Simulating build process (replace with mvn/gradle/npm build)
                echo "Building the application..."
            }
        }

        // -----------------------------------
        // Stage 3: Run Unit Tests
        // -----------------------------------
        stage('Run Tests') {
            steps {
                // Example for Maven project:
                // sh 'mvn test'

                echo "Executing unit tests..."

                /*
                After test execution, test tools generate XML reports
                Example Path (Maven):
                target/surefire-reports/*.xml
                */
            }
        }
    }

    /*
    =========================================================
    POST ACTIONS (Executed After Stages)
    =========================================================
    */

    post {

        // Always publish test reports (even if tests fail)
        always {

            junit(
                // Path to JUnit XML test report files
                testResults: 'target/surefire-reports/*.xml',

                // Prevents build from failing if reports are missing
                allowEmptyResults: true
            )
        }

        // If tests fail, mark build as unstable instead of failed
        unstable {
            echo "Some tests failed. Check JUnit reports in Jenkins dashboard."
        }

        // If everything passes
        success {
            echo "All unit tests passed successfully ✅"
        }

        // If pipeline fails due to critical errors
        failure {
            echo "Pipeline failed ❌ Check logs for debugging."
        }
    }
}

/*
=========================================================
📊 What Jenkins Shows After JUnit Integration
=========================================================

✔ Total test count
✔ Passed tests
✔ Failed tests
✔ Test trends graph
✔ Failure stack traces

Dashboard Path:
Job → Test Result → Detailed Reports
=========================================================
*/
