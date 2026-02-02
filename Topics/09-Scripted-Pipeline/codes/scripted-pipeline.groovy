/*
===========================================
🚀 BASIC SCRIPTED JENKINS PIPELINE
===========================================

This pipeline demonstrates:
✔ Scripted syntax
✔ node block usage
✔ Sequential stage execution
*/

node {

    stage('Build') {
        echo 'Building the application'
    }

    stage('Test') {
        echo 'Running tests'
    }

    stage('Deploy') {
        echo 'Deploying application'
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

node {}        → Allocates Jenkins executor
stage()        → Logical grouping of steps
echo           → Prints message to console

--------------------------------------------
📌 KEY POINTS
--------------------------------------------

✔ Scripted pipeline uses Groovy
✔ No fixed structure like Declarative
✔ Full programming capabilities
✔ Suitable for advanced pipelines
*/
