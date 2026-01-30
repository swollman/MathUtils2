pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {

        stage('Checkout') {
            steps {
                git url: 'https://github.com/swollman/MathUtils2.git', branch: 'master'
            }
        }

        stage('Build Java with Maven') {
            steps {
                sh 'mvn clean test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Run Python Tests') {
            steps {
                sh '''
                    /Library/Frameworks/Python.framework/Versions/3.13/bin/pip3 install pytest
                    /Library/Frameworks/Python.framework/Versions/3.13/bin/python3 -m pytest src/main/python --junitxml=python-test-results.xml
                '''
            }
            post {
                always {
                    junit 'python-test-results.xml'
                }
            }
        }
    }

    triggers {
        githubPush()
        cron('H H * * *')
    }
}





