pipeline {
	  agent any
    tools{
	    maven "M2_HOME"
	    java "JAVA_HOME"
		
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
	   stage('hello') {
		      steps {
		       echo "Hello Word"
		      }
		    }
	         
	    stage('Mvn Clean ') {
                        steps {
                           sh """mvn clean"""
                        }
                    }
            stage('SonarQube analysis') {

                      steps{
                          sh "mvn sonar:sonar"
                          }
                      }

	    
	    
            
      
    
      
      
	  }
	}
