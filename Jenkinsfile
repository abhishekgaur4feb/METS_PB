pipeline {
    agent any

 tools { 
        maven 'MAVEN_HOME' 
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
