pipeline {
	  agent any
	
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
