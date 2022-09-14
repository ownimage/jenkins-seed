node {
    jobDsl scriptText: """job('common-3') {
       steps {
           shell('echo Hello World!')
       }
     }"""
}

