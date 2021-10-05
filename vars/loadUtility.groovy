def call() {
   echo "inside loadutility"
  def obj = load "vars/utilities.groovy"
 
  echo "${obj.firstJob()}"
}
