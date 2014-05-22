organization := "com.typesafe.play"

name := "play-ebean-33-compat"

version := "1.0.1"

autoScalaLibrary := false

crossPaths := false

javacOptions in compile ++= Seq("-source", "1.6", "-target", "1.6")

mappings in (Compile, packageBin) := {
  val oldMappings: Seq[(File, String)] = (mappings in (Compile, packageBin)).value
  oldMappings.filter(m => m._1.isDirectory || m._2 == "com/avaje/ebean/Query$UseIndex.class")
}

publishTo := {
  val repo = "https://private-repo.typesafe.com/typesafe/"
  Some(if (version.value.trim.endsWith("SNAPSHOT")) {
    "snapshots" at repo + "maven-snapshots/"
  } else {
    "releases"  at repo + "maven-releases/"
  })
}

