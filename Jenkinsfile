node {
    jobDsl scriptText: """job('example-3') {
       steps {
           shell('echo Hello World!')
       }
     }"""

     echo(sh returnStdout: true, script: 'pwd')
     echo(sh returnStdout: true, script: 'ls')


    jobDsl targets: ['test.groovy'].join('\n'),
           removedJobAction: 'DELETE',
           removedViewAction: 'DELETE',
           lookupStrategy: 'SEED_JOB',
           additionalClasspath: ['libA.jar', 'libB.jar'].join('\n'),
           additionalParameters: [message: 'Hello from pipeline', credentials: 'SECRET']
}

