def call() {
  pipeline {
       agent any
      
       stages {
           stage("Tools initialization") {
               steps {
                   echo "Started"
                 echo "${env.GIT_BRANCH}"
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
