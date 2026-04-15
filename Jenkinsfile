pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/Chandrika131005/Shopping-cart'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t 23mis0200/cart-app .'
            }
        }

        stage('Docker Push') {
            steps {
                bat 'docker push 23mis0200/cart-app'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                bat 'kubectl apply -f deployment.yaml'
                bat 'kubectl apply -f service.yaml'
            }
        }
    }
}