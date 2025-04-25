pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from GitHub
                git url: 'https://github.com/ShubhamBolave/DevopsPrac.git', credentialsId: 'f2e2ecab-4f19-43c5-b93f-b7c7be2d0a5c'
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
