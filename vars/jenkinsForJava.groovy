def call() {
  pipeline {
       agent any
      
       stages {
           stage("Tools initialization") {
               steps {
                   sh 'echo "A one line step"'
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
