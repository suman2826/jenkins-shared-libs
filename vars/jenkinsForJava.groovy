def call(String repoUrl) {
  pipeline {
       agent any
       tools {
           maven 'Maven 3.5.0'
           jdk 'jdk8'
       }
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
