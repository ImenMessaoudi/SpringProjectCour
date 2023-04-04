pipeline {
	  agent any
    tools{
	    maven "M2_HOME"
	    
		
    }
	environment {
	        PATH = "$PATH:/usr/share/maven/bin"
	    }

    stages {
	     stage('Git clone ') {
            steps {
                git branch: 'main',
                credentialsId: 'Jenkins-GitHub',
                url: 'https://github.com/ImenMessaoudi/SpringProjectCour.git'
               
            }
        }
	    
	    stage('Testing maven') {
		      steps {
		       sh """mvn -version"""
		      }
		    }
	    stage('Testing java') {
		      steps {
		       sh """java -version"""
		      }
		    }
	    
	   stage('MVN-COMPILE') {
                 steps {
                    sh """mvn compile"""
                 }
            }
	         
	    stage('Mvn Clean ') {
                        steps {
                           sh """mvn clean"""
                        }
                    }
	    
	     stage('Mvn-Build') {
                steps {
                    script{
                        sh """mvn -Dmaven.test.failure.ignore=true clean package"""
                    }
                }
            }

            stage('mvn-SONARQUBE') {
                 steps {
                    withSonarQubeEnv('sonarqube'){
                        sh """mvn sonar:sonar"""
                    }

                 }
            }
	    
	    
           

	    
	  
    
      
      
	  }
	}
