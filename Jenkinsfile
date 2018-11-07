#!groovy

@Library('utils')_


stage('Demo') {
 echo 'Hello World'
 def o = new org.Foo()
 node {
   o.checkOutFrom 'git-plugin'
   parallelize (3)
 }
}