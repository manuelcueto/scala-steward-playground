name := "m"

version := "0.2.5"

organization := "com.manuelcueto"

scalaVersion := "2.12.4"

val akkaVersion = "2.5.11"

resolvers ++= Seq(
  Resolver.bintrayRepo("ovotech", "maven"),
  Resolver.bintrayRepo("slamdata-inc", "maven-public"),
  "segence" at "https://dl.bintray.com/segence/maven-oss-releases/",
  Resolver.sonatypeRepo("releases")
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.ovoenergy" %% "algae" % "0.2.1",
  "io.kamon" %% "kamon-jmx-collector" % "0.1.6",
  "com.typesafe.akka" %% "akka-http" % "10.1.0",
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % "test",
  "org.scala-lang.modules" %% "scala-xml" % "1.1.1",
  "com.github.pathikrit" %% "better-files" % "3.4.0",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.8.0",
  "com.amazonaws" % "aws-java-sdk-s3" % "1.11.294",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "test",
  "org.iq80.leveldb" % "leveldb" % "0.10",
  "org.typelevel" %% "cats-core" % "1.6.1",
  "com.lightbend.akka" %% "akka-stream-alpakka-s3" % "0.17" % "test"
)

parallelExecution in Test := false
