/*
===========================================
🐍 PYTHON BUILD IN JENKINS
===========================================

This pipeline demonstrates:
✔ Python script execution
✔ Simple CI task
*/

pipeline {

    agent any

    stages {

        stage('Run Script') {
            steps {
                sh 'python3 app.py'
            }
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

python3       → Python interpreter
app.py        → Application script
sh            → Runs shell command

✔ Suitable for scripts & services
✔ Python must be installed on agent
*/
