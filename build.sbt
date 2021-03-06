name := "play-hmrc-api"

lazy val library = (project in file("."))
  .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning)
  .settings(
    scalaVersion := "2.11.11",
    crossScalaVersions := Seq("2.11.11"),
    libraryDependencies ++= AppDependencies(),
    resolvers := Seq(
      Resolver.bintrayRepo("hmrc", "releases"),
      "typesafe-releases" at "http://repo.typesafe.com/typesafe/releases/",
      Resolver.jcenterRepo
    )
  )
