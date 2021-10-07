// def call(Map config=[:], Closure body) {
//     node {
//         git url: "https://github.com/werne2j/sample-nodejs"
//         stage("Install") {
//             sh "npm install"
//         }
//         stage("Test") {
//             sh "npm test"
//         }
//         stage("Deploy") {
//             if (config.deploy) {
//                 sh "npm publish"
//             }
//         }
//         body()
//     }
// }

def call(String name="Suman") {
    echo "deploymentTrack: ${params.deploymentTrack}"
    env.foo="hello"
    echo "${env.foo}"
    echo "Welcome, ${name}"
    loadUtility()
}

