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

   checkOutFrom(this, 'git-plugin')
   git url: "git@github.com:jenkinsci/git-plugin"
   
 }
}