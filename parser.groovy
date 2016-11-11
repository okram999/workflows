// class Student {
//     Number id
//     String name
//     Map results
// }
//
// class ClassReport {
//     String testScore
//     String projectScore
//     String comment
// }

import groovy.json.JsonSlurper


JsonSlurper slurper = new JsonSlurper()
def json = slurper.parse(new File('dev.json'))

println json
println json.dev
println ("The first node is: " + json.dev[0])
println ("The first node is: " + json.dev[1])
println ("The first node is: " + json.dev[2])
