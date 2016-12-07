node('Linux'){

  stage name: 'Git Clone', concurrency: 1
     checkout([$class: 'GitSCM', branches: [[name: '*/master']],
     doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [],
     userRemoteConfigs: [[credentialsId: '6a5fffc4-b16a-4bc7-941d-c5af37f6fe3f',
     url: 'git@github.com:learn-chef123/chef-repo.git']]])

  stage name: 'berks install', concurrency: 1
     sh 'berks'

  stage name: 'kitchen test', concurrency: 1
     sh 'kitchen destroy && kitchen converge'

}
