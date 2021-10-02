def call() {
  pipeline {
       agent any
      
       stages {
           stage("Tools initialization") {
               steps {
                   echo "suman"
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
