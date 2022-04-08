pipeline {
    agent any

    stages {
    	 stage('clean and Compile') {
            steps {
                echo 'Clean and Compile An Application'
                sh "mvn clean compile"
            }
        }
        stage('Build') {
            steps {
                echo 'Build An Application'
                sh "mvn install"
            }
        }
        stage('Test') {
            steps {
                 echo 'Test An Application'
                 sh "mvn test site"
            }
            post{
            	always{
            		junit allowEmptyResults: true , testResults: 'target/surefire-reports/*.xml'
            	}
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy An Application'
                sh "mvn package"
            }
        }
        stage('Archiving') {
            steps {
                echo 'Archiving An Application  archiveArtifacts **/target/*.jar'
                archiveArtifacts artifacts: 'screenshots/**,build/test/results/*.xml', allowEmptyArchive: true
            }
        }
    }
     post {
        always {
            echo 'One way or another, I have finished and clean up our workspace'
            deleteDir() /* clean up our workspace */
        }
        success {
            echo 'I succeeded!'
            emailext body: 'Hi From jenkins report Is Successfully Passed ', subject: 'Jenkins Report File', to: 'sahidalom6900@gmail.com'
        }
        unstable {
            echo 'I am unstable :/'
        }
        failure {
            echo 'I failed :('
            emailext body: 'Hi From jenkins Report Generate failed', subject: 'Jenkins Report File', to: 'sahidalom6900@gmail.com'
        }
        changed {
            echo 'Things were different before...'
        }
    }
}
