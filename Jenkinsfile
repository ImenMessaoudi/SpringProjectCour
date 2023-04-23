pipeline {
	  agent any
  
	environment {
		PATH =  "/opt/apache-maven-3.5.4/bin/:$PATH"
	}

    stages {
	     stage('Git clone ') {
            steps {
                git branch: 'main',
                credentialsId: 'Token-Github',
                url: 'https://github.com/ImenMessaoudi/SpringProjectCour.git'
               
            }
        }
	    
	    stage('Testing maven') {
		      steps {
		       sh """mvn -version"""
		      }
		    }
	   
	    stage('Mvn Clean ') {
                        steps {
                           sh """mvn clean"""
                        }
                    }
	    
	   stage('Mvn Compile ') {
                        steps {
                           sh """mvn compile"""
                        }
                    }
	   
	    
	     

            stage('mvn-SONARQUBE') {
                 steps {
                    withSonarQubeEnv('sonarqube'){
                        sh """mvn sonar:sonar"""
                    }

                 }
		        
            }
	    stage('Uploader To Nexus') {
		      steps {
		       nexusArtifactUploader artifacts: [
			       [
				       artifactId: 'spring-boot-starter-parent',
				       classifier: '',
				       file: 'target/FirstProjectSpring-0.0.1-SNAPSHOT.jar', type: 'jar'
			       ]
		       ],
			       credentialsId: 'nexus3',
			       groupId: 'org.springframework.boot',
			       nexusUrl: '192.168.0.200:8081',
			       nexusVersion: 'nexus3',
			       protocol: 'http',
			       repository: 'http://192.168.0.200:8081/repository/Simpleapp-Release',
			       version: '0.0.1-SNAPSHOT'
		      }
		    }
	    
	    
           

	    
	  
    
      
      
	  }
	}
