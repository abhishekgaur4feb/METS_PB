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
            
          emailext (
      to: 'abhishekgaur054@gmail.com',
      subject: Html Reports for test case run,
      body: details,
      recipientProviders: [[$class: 'DevelopersRecipientProvider']]
    )
            
            
        }
		
    }
