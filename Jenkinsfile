pipeline {
    agent  any
    stages {
        stage('Build') {
            steps {
               withMaven(maven:'maven:3.5.4'){
                sh 'mvn clean compile'
                }
            }
        }
        stage('Test') {
            steps {
                withMaven(maven:'maven:3.5.4'){
                                sh 'mvn clean compile'
                }
            }
        }
        stage('Deploy') {
            steps {
                withMaven(maven:'maven:3.5.4'){
                                sh 'mvn clean compile'
                                }
            }
        }
    }
}
