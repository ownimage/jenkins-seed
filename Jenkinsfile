node {
    jobDsl scriptText: """job('example-3') {
       steps {
           shell('echo Hello World!')
       }
     }"""

     shell('pwd')
     shell('ls')

    jobDsl targets: ['jobs/common.groovy'].join('\n'),
           removedJobAction: 'DELETE',
           removedViewAction: 'DELETE',
           lookupStrategy: 'SEED_JOB',
           additionalClasspath: ['libA.jar', 'libB.jar'].join('\n'),
           additionalParameters: [message: 'Hello from pipeline', credentials: 'SECRET']
}

