pipeline {
	  agent any
    tools{
	    maven "M2_HOME"
	    java "/usr/lib/jvm/jre-11-openjdk"
		
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
		    withSonarQubeEnv(credentialsId: 'sonarqube') {
                           sh "mvn sonar:sonar"
                        }

                     
                      }

	    
	    
            
      
    
      
      
	  }
	}
