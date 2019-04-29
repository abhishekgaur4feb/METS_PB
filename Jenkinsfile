pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3_3_9') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_3_9') {
                    sh 'mvn install'
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
