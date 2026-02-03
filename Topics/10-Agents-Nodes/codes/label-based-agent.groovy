/*
===========================================
🏷️ LABEL BASED AGENT SELECTION
===========================================

This pipeline runs only on
nodes with specific labels.
*/

pipeline {

    agent {
        label 'linux-node'
    }

    stages {

        stage('Test') {
            steps {
                echo 'Running tests on Linux node'
            }
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

label 'linux-node' → Restricts execution
Only matching nodes → Will run pipeline
Useful for OS-specific builds

✔ Linux / Windows separation

*/
