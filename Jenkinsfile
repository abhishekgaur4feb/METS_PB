pipeline {
    agent any

 tools { 
        maven 'MAVEN_HOME' 
       }
    stages {
        stage ('Compile Stage') {

            steps {
                  bat 'mvn clean'
               
            }
        }

        stage ('Testing Stage') {

            steps {
                  bat 'mvn install'
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
		  post {
		always {
       	mail to: 'abhishekgaur054@gmail.com',
          subject: "Status of pipeline: ${currentBuild.fullDisplayName}",
          body: "${env.BUILD_URL} has result ${currentBuild.result}"
    }
  }
		
    }
