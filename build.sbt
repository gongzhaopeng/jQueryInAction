name := "jQueryInAction"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  "org.jscience" % "jscience" % "4.3.1",
  "org.postgresql" % "postgresql" % "9.4.1207"
)

routesGenerator := InjectedRoutesGenerator