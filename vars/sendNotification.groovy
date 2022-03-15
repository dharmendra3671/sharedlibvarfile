def call(String buildStatus = 'STARTED') {
  // build status of null means successful
  buildStatus = buildStatus ?: 'SUCCESS'

  // Default values
  def subject = "Jenkins Pipeline ${buildStatus}"
  def details = "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n ${currentBuild.currentResult}: Job ${env.JOB_NAME}"

 emailext (
      to: 'kumar.dk3671@gmail.com',
      subject: subject,
      body: details
    )
}
