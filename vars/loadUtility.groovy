def call() {
  def obj = load "utilities.groovy"
  echo "inside loadutility"
  echo "${obj.firstJob()}"
}
