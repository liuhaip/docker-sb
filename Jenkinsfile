pipeline {
   agent none

   stages {
     stage('maven进行项目构建') {
        agent {
          docker {
            args '-v /root/.m2:/root/.m2'
            image 'maven:3-alpine'
          }
        }
       steps {
          sh label: '', script: 'mvn -gs setting.xml clean package -Dmaven.test.skip=true'
          sh 'pwd'
          sh 'ls'
          sh 'echo 666'
       }
     }

     stage('docker构建镜像') {
       agent any
       steps {
         // One or more steps need to be included within the steps block.
       }
     }

     stage('docker swarm进行部署') {
       agent any
       steps {
         // One or more steps need to be included within the steps block.
       }
     }

   }



}