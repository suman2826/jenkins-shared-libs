def call() {
   echo "inside loadutility"
  def obj = load "utilities.groovy"
 
  echo "${obj.firstJob()}"
}
