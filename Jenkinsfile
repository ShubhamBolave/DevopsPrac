pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/ShubhamBolave/DevopsPrac.git', branch: 'main', credentialsId: 'your-credentials-id'
            }
        }

        stage('Build') {
            steps {
                script {
                    sh 'javac PrimeNumber.java'
                }
            }
        }

        stage('Run') {
            steps {
                script {
                    sh 'java PrimeNumber'
                }
            }
        }
    }

    post {
        always {
            cleanWs() // Will work after plugin is installed
        }
    }
}
