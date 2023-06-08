pipeline {
    agent any 

    tools { 
        maven 'jenkinsmaven'
        jdk 'java11'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/rvasquezf/ProjectDevops.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Test') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }


stage('Sonar Scanner') {
    steps {
        withSonarQubeEnv('SonarQube') { 
            sh 'mvn sonar:sonar -Dsonar.projectKey=GS -Dsonar.sources=src/main/java/com/kibernumacademy/devops -Dsonar.tests=src/test/java/com/kibernumacademy/devops -Dsonar.java.binaries=.'
        }
    }
}

        stage('Quality Gate'){
            steps{
                timeout(time:1, unit:'HOURS'){
                    waitForQualityGate abortPipeline:true
                }
            }
        }

    }
}