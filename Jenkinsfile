pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven-352') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven-352') {
                    sh 'mvn test'
                }
            }
        }

        stage ('Smoke Test') {

            steps {
                withMaven(maven : 'maven-352') {
                    sh 'mvn  -Dtest={com.techprimers.testing.FizzBuzzTest.testFizz()} test'
                }
            }
        }

    }
}