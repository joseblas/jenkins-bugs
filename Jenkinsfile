pipeline {
    agent any
    def branch='PIPELINE'
    stages {
        stage('Phase 1'){
            steps{

                sh "echo two"
                checkout([$class: 'GitSCM',
                              userRemoteConfigs: [[url: 'https://github.com/joseblas/jenkins-bugs',
                                                   refspec: "+refs/heads/${branch}:refs/remotes/origin/${branch}",
                                                  ]],
                              branches: [[name: branch]],
                              extensions: [[$class: 'AuthorInChangelog'],
                                           [$class: 'CleanCheckout'],
                                           [$class: 'CloneOption',
                                            honorRefspec: true,
                                            noTags: true,
                                            reference: '/var/lib/git/mwaite/bugs/jenkins-bugs.git',
                                            timeout: 2],
                                           [$class: 'LocalBranch', localBranch: branch],
                                           ],
                              gitTool: scm.gitTool
                             ])
           }
        }
    }

}