/*
===========================================
🎯 STAGE LEVEL ENVIRONMENT VARIABLES
===========================================

This pipeline demonstrates:
✔ Stage-specific environment variables
✔ Scoped variable usage
*/

pipeline {

    agent any

    stages {

        stage('Build') {

            // 🔹 Stage-level environment
            environment {
                BUILD_TOOL = "Maven"
            }

            steps {
                echo "Building with ${BUILD_TOOL}"
            }
        }

        stage('Test') {

            environment {
                TEST_TYPE = "Unit Tests"
            }

            steps {
                echo "Running ${TEST_TYPE}"
            }
        }
    }
}

/*
--------------------------------------------
🧠 EXPLANATION
--------------------------------------------

Stage environment → Limited to that stage
BUILD_TOOL       → Available only in Build
TEST_TYPE        → Available only in Test

✔ Better variable scoping

*/
