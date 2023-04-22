pipeline {
	  agent any
    tools{
	    maven "M2_HOME"
	    
		
    }
	environment {
		PATH =  "/opt/apache-maven-3.5.4/bin/:$PATH"
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
	    stage('Testing java') {
		      steps {
		       sh """java -version"""
		      }
		    }
	    
	    stage('Mvn Clean ') {
                        steps {
                           sh """mvn clean"""
                        }
                    }
	    
	   
	   
	    
	     

            stage('mvn-SONARQUBE') {
                 steps {
                    withSonarQubeEnv('sonarqube'){
                        sh """mvn sonar:sonar"""
                    }

                 }
            }
	    
	    
           

	    
	  
    
      
      
	  }
	}
