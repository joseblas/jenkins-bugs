#!groovy

@Library('utils')_


stage('Demo') {
 echo 'Hello World'
 mvn -v
 def o = new org.Foo()
 node {
   o.checkOutFrom 'git-plugin'
   cd git-plugin
   mvn clean compile
   o.parallelize(3)
 }
}