/*
===========================================
🔐 SSH BASED JENKINS AGENT
===========================================

This pipeline runs on an agent
connected to Jenkins via SSH.
*/

pipeline {

    agent {
        label 'ssh-agent'
    }

    stages {

        stage('Build') {
            steps {
                echo 'Running build on SSH agent'
            }
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

agent { label } → Selects node by label
'ssh-agent'     → Label assigned to SSH node
stage()         → Pipeline execution step
echo            → Console output

📌 SSH agents are useful for remote servers.
*/
