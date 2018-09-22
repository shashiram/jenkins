pipeline {
    agent  any
    stages {
        stage('Build') {
            steps {
               withEnv(maven:'maven:3.5.4'){
                sh 'mvn clean compile'
                }
            }
        }
        stage('Test') {
            steps {
                withEnv(maven:'maven:3.5.4'){
                                sh 'mvn clean compile'
                }
            }
        }
        stage('Deploy') {
            steps {
                withEnv(maven:'maven:3.5.4'){
                                sh 'mvn clean compile'
                                }
            }
        }
    }
}
