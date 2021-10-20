def call() {
  pipeline {
    agent any
       options {
        disableConcurrentBuilds()
              skipDefaultCheckout()
    }
       parameters {
              choice (
                     name: "deploymentTrack",
                     choices: ['cr','ar1','ar2', 'pr'],
                     description: "choose tracl"
                     )
       }
      
       stages {
           stage("Tools initialization") {
               steps {
                   echo "Started"
                 echo "${env.BRANCH_NAME}"
                  
                 script {
                 welcomeJob()
//                  echo "${env.foo}"
                 }
                 echo "${env.foo}"
               }
           }
          stage("Checking") {
              steps {
                   echo "checking"
               }
           }
           
           
           stage("Running Testcase") {
              steps {
                   echo "completedsss"
               }
           }
           stage("Running Testcasesssss") {
              steps {
                   echo "completedsssed"
               }
           }
           
       }
   }
}
