/*
===========================================
☕ MAVEN BUILD IN JENKINS
===========================================

This pipeline demonstrates:
✔ Java project build
✔ Maven usage
*/

pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

mvn clean      → Cleans previous builds
mvn package    → Compiles & packages app
sh             → Executes shell command

✔ Requires Maven on agent
✔ Used for Java projects
*/
