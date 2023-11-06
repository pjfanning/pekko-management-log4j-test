ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "pekko-management-log4j-test",
    libraryDependencies ++= Seq(
      "org.apache.pekko" %% "pekko-management-loglevels-log4j2" % "1.0.0",
        //exclude("org.apache.logging.log4j", "log4j-slf4j-impl"),
      "org.apache.logging.log4j" % "log4j-core" % "2.21.1",
      "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.21.1",
      "org.apache.pekko" %% "pekko-testkit" % "1.0.1" % Test,
      "org.apache.pekko" %% "pekko-http-testkit" % "1.0.0" % Test,
      "org.scalatest" %% "scalatest" % "3.2.17" % Test
    )
  )
