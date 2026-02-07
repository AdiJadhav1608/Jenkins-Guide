/*
===========================================
🟢 NODE.JS BUILD IN JENKINS
===========================================

This pipeline demonstrates:
✔ Node.js dependency install
✔ Build execution
*/

pipeline {

    agent any

    stages {

        stage('Install Dependencies') {
            steps {
                sh 'npm install'
            }
        }

        stage('Build') {
            steps {
                sh 'npm run build'
            }
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

npm install   → Downloads dependencies
npm run build → Executes build script
sh            → Shell execution

✔ Used for frontend / Node apps
✔ Node.js must be installed on agent
*/
