pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
        python 'Python3'
    }

    stages {

        stage('Checkout') {
            steps {
                git url: 'https://github.com/swollman/MathUtils2.git', branch: 'master'
            }
        }

        stage('Build Java with Maven') {
            steps {
                dir('src/main/java') {
                    sh 'mvn -f ../../pom.xml clean test'
                }
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
                    pip install pytest
                    pytest src/test/python --junitxml=python-test-results.xml
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

    post {
        always {
            echo "Build completed."
        }
    }
}
