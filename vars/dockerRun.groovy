def call(String name) {
  sh "docker run -v "${PWD}:/data" -t ${name}"
}
