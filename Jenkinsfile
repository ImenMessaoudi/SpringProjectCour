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
		sh "mvn clean"
	      }
	    }
        
	    
	    stage("compile Project"){
            steps {
                 sh 'mvn compile'
                  echo 'compile stage done'
            }
        }

	    
            
      
    
      
      
	  }
	}
