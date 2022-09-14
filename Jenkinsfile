node {
    jobDsl scriptText: """job('example-3') {
       steps {
           shell('echo Hello World!')
       }
     }"""

     def directory = sh(script: "pwd", returnStdout:true)
     echo "Directory $directory"
     def ls =  sh(script: "ls", returnStdout:true)
     echo "Files $ls"


    jobDsl targets: ['test.groovy'].join('\n'),
           removedJobAction: 'DELETE',
           removedViewAction: 'DELETE',
           lookupStrategy: 'SEED_JOB',
           additionalClasspath: ['libA.jar', 'libB.jar'].join('\n'),
           additionalParameters: [message: 'Hello from pipeline', credentials: 'SECRET']
}

