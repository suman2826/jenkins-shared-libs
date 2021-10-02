def call() {
  pipeline {
       agent any
      
       stages {
           stage("Tools initialization") {
               steps {
                   
                   echo "suman"
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
