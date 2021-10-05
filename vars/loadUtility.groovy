def call() {
   echo "inside loadutility"
   def rootDir = pwd()
   echo "${rootDir}"
   def obj = load "${rootDir}@script/utilities.groovy"
//   def obj = load "vars/utilities.groovy"
   echo "here"
 
  echo "${obj.firstJob()}"
}
