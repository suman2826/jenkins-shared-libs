def call() {
   echo "inside loadutility"
   def rootDir = pwd()
   def obj = load "${rootDir}@script/utilities.Groovy "
//   def obj = load "vars/utilities.groovy"
   echo "here"
 
  echo "${obj.firstJob()}"
}
