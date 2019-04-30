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
            echo 'One way or another, I have finished'
            
        }
        success {
          mail to: 'abhishekgaur054@gmail.com',
          subject: "Success Pipeline: ${currentBuild.fullDisplayName}",
          body: "Build Successfully Deployed ${env.BUILD_URL}",                
          attachmentsPattern: '**target/cucumber.json'
        }
        failure {
          mail to: 'abhishekgaur054@gmail.com',
          subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
          body: "Something is wrong with ${env.BUILD_URL}",                
          attachmentsPattern: '**target/cucumber.json'
        }
        
    }
  
		
    }
