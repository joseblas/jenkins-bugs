#!groovy

@Library('utils')_


stage('Demo') {
 echo 'Hello World'
 node {
   deleteDir()
   echo 'Hello Node'
   def o = new org.Foo()
   o.parallelize(3)
   mvnHome = tool name: 'M3', type: 'maven'
   echo mvnHome
  

   
 }
}