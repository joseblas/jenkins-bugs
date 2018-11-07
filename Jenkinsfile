#!groovy

@Library('utils')_


stage('Demo') {
 echo 'Hello World'
 node {
   deleteDir()
   echo 'Hello Node'
   o.parallelize(3)
   mvnHome = tool name: 'M3', type: 'maven'
   echo mvnHome
   def o = new org.Foo()
   //o.checkOutFrom 'git-plugin'
   //cd git-plugin
   sh "'${mvnHome}/bin/mvn'. -DskipTests -Dmaven.test.skip=true clean package"
   
 }
}