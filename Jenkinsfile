pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from GitHub
                git 'https://github.com/ShubhamBolave/DevopsPrac.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Compile Java code
                    sh 'javac PrimeNumber.java'
                }
            }
        }

        stage('Run') {
            steps {
                script {
                    // Run the Java application
                    sh 'java PrimeNumber'
                }
            }
        }
    }

    post {
        always {
            // Clean up workspace
            cleanWs()
        }
    }
}
