def call() {
   echo "inside loadutility"
   def rootDir = pwd()
   def obj = load "${rootDir}@script/utilities.groovy"
//   def obj = load "vars/utilities.groovy"
   echo "here"
 
  echo "${obj.firstJob()}"
}
