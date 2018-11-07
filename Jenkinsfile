#!groovy

@Library('utils')_


stage('Demo') {
 echo 'Hello World'
 mvnHome = tool name: 'M3', type: 'maven'
 echo mvnHome
 def o = new org.Foo()
 node {
   o.checkOutFrom 'git-plugin'
   cd git-plugin
    sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
   o.parallelize(3)
 }
}