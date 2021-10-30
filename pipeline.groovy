pipeline {
    agent any

    stages {
        stage('list files') {
            steps {
                sh 'python3.9 /external/selenium_simple.py'
            }
        }
    }
}