name := "scala-basics-6"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.5" % "test"
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.4.3"
//libraryDependencies += "com.typesafe.play" %% "play-json" % "2.3.10"


transitiveClassifiers in Global := Seq(Artifact.SourceClassifier)

updateOptions := updateOptions.value.withCachedResolution(true)
