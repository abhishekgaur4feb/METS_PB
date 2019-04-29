pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                     sh 'mvn clean compile'
                  }
        }

        stage ('Testing Stage') {

            steps {
                  sh 'mvn install'
                
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
