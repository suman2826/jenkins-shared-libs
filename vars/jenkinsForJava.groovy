def call(name="shonzen") {
  pipeline {
       agent any
      
       stages {
           stage("Tools initialization") {
               steps {
                   echo "suman ${name}"
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
