def call() {
  pipeline {
       agent any
      
       stages {
           stage("Tools initialization") {
               steps {
                   echo "Started"
                 echo "${env.GIT_BRANCH}"
                  echo "${env.GIT_COMMIT}"
                   echo "${env.GIT_PREVIOUS_COMMIT}"
                  echo "${env.commitEmail}"
                  echo "${env.commitName}"
               }
           }
          stage("Checking") {
              steps {
                   echo "checking"
               }
           }
           
           
           stage("Running Testcase") {
              steps {
                   echo "completed"
               }
           }
           
       }
   }
}
