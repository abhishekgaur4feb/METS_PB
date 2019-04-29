pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3.3.9') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3.3.9') {
                    bat 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3.3.9') {
                    bat 'mvn deploy'
                }
            }
        }
		
		    stage ('Cucumber Reports') {

            steps {
               cucumber buildStatus: "UNSTABLE",
               fileIncludePattern: "**/cucumber.json",
               jsonReportDirectory: 'target'
                }
            }
        }
		
		
		
		
    }
