pipeline {
	  agent any
	tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M2_HOME"
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


	    stage('Build') {
	      steps {
		sh "mvn clean"
	      }
	    }
  

	    
            
      
    
      
      
	  }
	}
