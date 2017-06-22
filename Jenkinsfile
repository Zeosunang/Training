#!groovy

node {
  try {
    stage('Build') {
        checkout scm
        sh 'mvn clean install -DskipTests'
    }
    stage('Test') {
        sh 'mvn test --fail-at-end'
        junit '**/target/surefire-reports/*.xml'
    }
  } catch (e) {
    currentBuild.result = "FAILED"
    notifyFailed()
    throw e
  }  
}

def notifyFailed() {
  emailext (
      subject: "'${env.JOB_NAME} [${env.BUILD_NUMBER}]' fehlgeschlagen",
      body: "${env.BUILD_URL} konnte nicht gebaut werden.",
      recipientProviders: [[$class: 'DevelopersRecipientProvider']]
    )
}
