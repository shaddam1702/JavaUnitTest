// node{
//   stage('SCM Checkout'){
//     git 'https://github.com/shaddam1702/JavaUnitTest'
//   }
//   stage('Compile-package'){
//     def mvnHome = tool name: 'maven-3', type: 'maven'
//     sh "${mvnHome}/bin/mvn package"
//   }
  
// }

pipeline {
    agent any

	tools {
        maven 'mvn'
        jdk 'jdk11'
    }

    
   	stage('SCM Checkout')
	{
	   steps{
           
	      git 'https://github.com/shaddam1702/JavaUnitTest'	
	}
	}
	
	stage('clean')
	{
	   steps{
           
	       sh ''' 
		   mvn clean'''	
	}
	}
	
	stage('install')
	{
		steps{
			sh '''
			
			mvn install

			'''
		}
	}

	
	stage('test') {
		steps {
			sh '''
				mvn test'''	
		}
	}
	

}
