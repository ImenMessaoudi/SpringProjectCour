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
	
	
    stage('Build') {
      steps {
        sh './mvnw clean install site surefire-report:report'
        sh 'tree'
      }
    }
  

	    
            
      
    
      
      
	  }
	}
