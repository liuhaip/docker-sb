pipleline{
   agent none
   stages {
     stage('项目构建'){
        //用maven环境
        agent {
                docker {
                    image 'maven:3-alpine'
                    args '-v /root/.m2:/root/.m2'
                }
        }

        steps {
         sh 'echo 123'
         sh 'mvn '
        }
     }

     stage('项目测试'){
         agent any
         //我们这个不能用到前面stage的环境。前面stage的用完就清除了。

     }
   }


}