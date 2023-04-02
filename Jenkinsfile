pipeline {
	  agent any
    tools{
	    maven "M2_HOME"
		
    }
	environment {
	        PATH = "$PATH:/usr/share/maven/bin"
	    }

    stages {
	    
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


	    
	    
            
      
    
      
      
	  }
	}
