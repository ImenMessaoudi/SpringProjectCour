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
	    
      stage('install') {
	      steps {
	        bat "mvn install -f Sp"ringProjectCour"
	      }
	    }
      
      stage('test') {
	      steps {
	        bat "mvn test -f SpringProjectCour"
	      }
	    }
      
      stage('package') {
	      steps {
	        bat "mvn package -f SpringProjectCour"
	      }
	    }
      
    
      
      
	  }
	}
