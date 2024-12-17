ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.15"

val mainClassName = "com.github.zjjfly.Main"

lazy val root = (project in file("."))
  .enablePlugins(NativeImagePlugin)
  .settings(
    name := "scala-template",
    libraryDependencies ++= Seq(
      "org.specs2" %% "specs2-core" % "4.20.9" % "test",
      "org.specs2" %% "specs2-mock" % "4.20.9" % "test"
    ),
    idePackagePrefix := Some("com.github.zjjfly"),
    assembly / mainClass := Some(mainClassName),
    Compile / mainClass := Some(mainClassName),
    //make sure GRAAL_HOME or GRAALVM_HOME in env
    nativeImageInstalled := true
  )
