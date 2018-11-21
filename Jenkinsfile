pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh "mvn clean test"
      }
    }
    stage('Test') {
      steps {
        echo 'Test is completed'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploy '
      }
    }
  }
}
