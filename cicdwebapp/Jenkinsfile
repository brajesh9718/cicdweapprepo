pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
               bat "rmdir  /s /q cicdwebapp/"
                bat "git clone https://github.com/brajesh9718/cicdweapprepo.git"
                bat "mvn clean -f cicdwebapp/"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f cicdwebapp/"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f cicdwebapp/"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f cicdwebapp/"
            }
        }
    }
}
