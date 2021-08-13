// node{
//   stage('SCM Checkout'){
//     git 'https://github.com/shaddam1702/JavaUnitTest'
//   }
//   stage('Compile-package'){
//     def mvnHome = tool name: 'maven-3', type: 'maven'
//     sh "${mvnHome}/bin/mvn package"
//   }
  
// }apache-maven-3.8.1
pipeline {
agent any
stages {
stage ('Compile Stage') {
steps {
withMaven(maven : 'apache-maven-3.8.1') {
bat'mvn clean compile'
}
}
}
stage ('Testing Stage') {
steps {
withMaven(maven : 'apache-maven-3.8.1') {
bat'mvn test'
}
}
}
stage ('Install Stage') {
steps {
withMaven(maven : 'apache-maven-3.8.1') {
bat'mvn install'
}
}
}
}
}
