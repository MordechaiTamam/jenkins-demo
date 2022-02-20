pipeline {
    agent {
        dockerfile true
        label 'agent_1'
        }
    stages {
        stage('list files') {
            steps {
                sh 'python3 selenium_simple.py'
            }
        }
    }
}