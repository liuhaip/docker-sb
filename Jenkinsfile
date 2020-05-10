pipeline{
   agent none

   //1、代码的检出==》2、maven构建jar包==》3、docker构建镜像==》4、docker swarm按照compose进行部署
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
       }
     }

     stage('docker构建镜像') {
       steps {
         // One or more steps need to be included within the steps block.
       }
     }

     stage('docker swarm进行部署') {
       steps {
         // One or more steps need to be included within the steps block.
       }
     }

   }



}