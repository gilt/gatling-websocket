name := "gatling-websocket"

organization := "com.giltgroupe.util"

version := "0.0.4"

scalaVersion := "2.9.2"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-encoding", "utf8")

javacOptions ++= Seq("-Xlint:deprecation", "-encoding", "utf8", "-XX:MaxPermSize=256M")

crossPaths := false

libraryDependencies ++= Seq(
    "com.ning" % "async-http-client" % "1.7.+",
    "com.excilys.ebi.gatling" % "gatling-core" % "1.3.5",
    "com.excilys.ebi.gatling" % "gatling-http" % "1.3.5"
)

libraryDependencies ++= Seq(
    "junit" % "junit" % "4.10" % "test",
    "org.mockito" % "mockito-core" % "1.9.+" % "test",
    "org.specs2" %% "specs2" % "1.12.+" % "test",
    "com.typesafe.akka" % "akka-testkit" % "2.0.+" % "test"
)

resolvers ++= Seq(
    "excilys" at "http://repository.excilys.com/content/groups/public",
    "typesafe" at "http://repo.typesafe.com/typesafe/releases"
)

publishTo := Some("Internal Releases" at "https://nexus.gilt.com/nexus/content/repositories/internal-releases/")
