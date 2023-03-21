pipeline {
	  agent any
	tools {
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
