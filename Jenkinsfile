pipeline {
    agent any

 tools { 
        maven 'Maven 3.3.9' 
       }
    stages {
        stage ('Compile Stage') {

            steps {
                  bat 'mvn clean compile'
               
            }
        }

        stage ('Testing Stage') {

            steps {
                  bat 'mvn test'
                  }
        }


        stage ('Deployment Stage') {
            steps {
                 bat 'mvn deploy'
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
