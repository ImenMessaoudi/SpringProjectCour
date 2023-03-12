pipeline {
	  agent any
	 
stages {
      stage('Testing maven') {
	      steps {
	       sh """mvn -version"""
	      }
	    }
	      stage('git repo & clean') {
	      steps {
	        bat "rmdir /s /q SpringProjectCour"
                bat "git clone https://github.com/ImenMessaoudi/SpringProjectCour.git"
		//bat "mvn clean -f Sp"ringProjectCour"
         
	      }
	    }
	    
     
      
    
      
      
	  }
	}
