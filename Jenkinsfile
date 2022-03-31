pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build An Application'
            }
        }
        stage('Test') {
            steps {
                 echo 'Test An Application'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy An Application'
            }
        }
    }
     post {
        always {
            echo 'One way or another, I have finished'
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
