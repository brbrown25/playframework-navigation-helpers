// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.10")

// The PGP plugin (for signing sonatype releases)
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

// The scoverage plugin (measures statement coverage for unit tests)
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.1.0")

addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.1.0")

