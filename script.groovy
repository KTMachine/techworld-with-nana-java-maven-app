def buildJar() {
  echo 'building the application...'
  sh 'mvn package'
}

def deployImage() {
  echo "building the docker image.."
  withCredentials ([usernamePassword(credentialsId: 'docker-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
      sh 'docker build -t ktmachine/demo-app:jma-2.0 .'
      sh 'echo $PASS | docker login -u $USER --password-stdin '
      sh 'docker push ktmachine/demo-app:jma-2.0'

  }
                
}

def deployApp() {
  echo 'deploying the application...'
}

return this
