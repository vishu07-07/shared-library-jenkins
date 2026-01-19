def call(String ImageName,String DockerHubUser,String ImageTag){
  withCredentials([usernamePassword(credentialsId:"dockerhubpassword",usernameVariable:"dockerHubUser",passwordVariable:"dockerHubPass")]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
}
  sh "docker push ${DockerHubUser}/${ImageName}:${ImageTag}"
}
