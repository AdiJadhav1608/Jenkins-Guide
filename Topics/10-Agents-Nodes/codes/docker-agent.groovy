/*
===========================================
🐳 DOCKER BASED JENKINS AGENT
===========================================

This pipeline runs inside
a Docker container.
*/

pipeline {

    agent {
        docker {
            image 'maven:3.9.6-eclipse-temurin-17'
        }
    }

    stages {

        stage('Build') {
            steps {
                echo 'Building inside Docker container'
            }
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

docker {}     → Uses Docker as execution agent
image         → Docker image for build
maven image   → Provides Maven + JDK
steps         → Commands inside container

✔ Clean environment
✔ No dependency conflicts
*/
