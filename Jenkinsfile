pipeline {
	  agent any
    tools{
	    maven "M2_HOME"
	    
		
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
	    stage('Testing java') {
		      steps {
		       sh """java -version"""
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
	    
	     stage('CODE ANALYSIS with SONARQUBE') {
        

          steps {
            withSonarQubeEnv('sonarqube') {
               sh '''sonarqube/bin/sonar-scanner -Dsonar.projectKey=Demo-Project-SonarQube \
                   -Dsonar.projectName=Demo-Project-SonarQube \
                   -Dsonar.projectVersion=1.0 \
                   -Dsonar.sources=src/ \
                   -Dsonar.java.binaries=target/test-classes/com/visualpathit/account/controllerTest/ \
                   -Dsonar.junit.reportsPath=target/surefire-reports/ \
                   -Dsonar.jacoco.reportsPath=target/jacoco.exec \
                   -Dsonar.java.checkstyle.reportPaths=target/checkstyle-result.xml'''
            }

            timeout(time: 10, unit: 'MINUTES') {
               waitForQualityGate abortPipeline: true
            }
          }
        }
	    
	    
           

	    
	  
    
      
      
	  }
	}
