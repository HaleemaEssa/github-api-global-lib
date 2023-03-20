def call(String name) {
  sh "docker run --privileged -t ${name}"
}
