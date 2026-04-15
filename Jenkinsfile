pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/your-repo/shopping-cart.git'
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
                bat 'docker build -t your-dockerhub/cart-app .'
            }
        }

        stage('Docker Push') {
            steps {
                bat 'docker push your-dockerhub/cart-app'
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