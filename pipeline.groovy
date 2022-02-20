pipeline {
    agent { label 'agent_1' }
    stages {
        stage('list files') {
            agent {
                docker{
                    dockerfile true
                    reuseNode true
                }
            }
            steps {
                sh 'python3.9 selenium_simple.py'
            }
        }
    }
}