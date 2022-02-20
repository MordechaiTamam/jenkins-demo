pipeline {
    agent {
        label 'agent_1'
        dockerfile true
        }
    stages {
        stage('list files') {
            steps {
                sh 'python3 selenium_simple.py'
            }
        }
    }
}