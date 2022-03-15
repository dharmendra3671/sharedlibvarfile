def call(String buildStatus = 'STARTED') {
  // build status of null means successful
  buildStatus = buildStatus ?: 'SUCCESS'

  // Default values
  def subject = "Jenkins Pipeline ${buildStatus}"
  def details = "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n ${currentBuild.currentResult}: Job ${env.JOB_NAME} \n ${currentBuild.currentResult}: ${env.BUILD_TAG}"

 emailext (
      to: 'kumar.dk3671@gmail.com',
      subject: subject,
      body: details
    )
}

import groovy.transform.SourceURI
import java.nio.file.Path
import java.nio.file.Paths

class ScriptSourceUri {
    @SourceURI
    static URI uri
}

def call() {
    Path scriptLocation = Paths.get(ScriptSourceUri.uri)
    return scriptLocation.getParent().getParent().resolve('resources/Scripts').toString()
}
