node{
  stage('SCM Checkout'){
    git 'https://github.com/shaddam1702/JavaUnitTest'
  }
  stage('Clean maven'){
    def mvnHome = tool name: 'maven-3', type: 'maven'
    sh "${mvnHome}/bin/mvn clean"
  }
   stage('Install maven'){
      def mvnHome = tool name: 'maven-3', type: 'maven'
    sh "${mvnHome}/bin/mvn install"
  }
   stage('Test maven'){
      def mvnHome = tool name: 'maven-3', type: 'maven'
    sh "${mvnHome}/bin/mvn test"
  }
}
