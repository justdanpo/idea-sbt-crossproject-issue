
lazy val client = project.in(file("client")).
  settings(
    name := "test",

    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.3"
    )

  ).enablePlugins(ScalaJSPlugin)

onLoad in Global ~= (_ andThen ("project client" :: _))
