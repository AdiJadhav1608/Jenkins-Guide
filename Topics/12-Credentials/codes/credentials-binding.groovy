/*
===========================================
🔐 CREDENTIALS BINDING IN JENKINS PIPELINE
===========================================

This pipeline demonstrates:
✔ Secure credentials usage
✔ Environment variable binding
✔ No hardcoded secrets
*/

pipeline {

    agent any

    stages {

        stage('Use Credentials') {

            steps {

                withCredentials([
                    usernamePassword(
                        credentialsId: 'github-creds',
                        usernameVariable: 'GIT_USER',
                        passwordVariable: 'GIT_PASS'
                    )
                ]) {

                    echo "Using credentials for user: ${GIT_USER}"
                }
            }
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

withCredentials() → Secure credential wrapper
credentialsId    → ID from Jenkins credentials store
usernameVariable → Injected username
passwordVariable → Injected password

✔ Secrets masked in console
✔ Available only inside block
✔ Best security practice
*/
