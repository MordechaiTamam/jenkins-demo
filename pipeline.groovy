pipeline {
    agent { label 'agent_1' }
    stages {
        stage('list files') {
            agent {
                docker {
                    image "moditamam/selenium:python3"
                    reuseNode true
                }
            }
            steps {
                sh 'python3.9 selenium_simple.py'
            }
        }
    }
}