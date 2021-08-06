node{
  stage('SCM Checkout'){
    git 'https://github.com/shaddam1702/JavaUnitTes'
  }
  stage('Clean maven'){
    sh 'mvn clean'
  }
   stage('Install maven'){
    sh 'mvn install'
  }
   stage('Test maven'){
    sh 'mvn test'
  }
}
