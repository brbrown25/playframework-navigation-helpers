name := """playframework-navigation-helpers"""

version := "0.0.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.11.8", "2.10.6")

libraryDependencies ++= Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

// latest sbt-gpg plugin needs to know these explicitly
pgpSecretRing := file("/Users/brown/.sbt/gpg/secring.asc")

pgpPublicRing := file("/Users/brown/.sbt/gpg/pubring.asc")

// needed to publish to maven central
publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/brbrown25/playframework-navigation-helpers</url>
  <licenses>
    <license>
      <name>Apache License, Version 2.0</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <connection>scm:git:git@github.com:brbrown25/playframework-navigation-helpers.git</connection>
    <developerConnection>scm:git:git@github.com:brbrown25/playframework-navigation-helpers.git</developerConnection>
    <url>git@github.com:brbrown25/playframework-navigation-helpers.git</url>
  </scm>
  <developers>
    <developer>
      <id>bbrownsound</id>
      <name>Brandon Brown</name>
      <email>brandon@bbrownsound.com</email>
      <timezone>UTC</timezone>
    </developer>
  </developers>)