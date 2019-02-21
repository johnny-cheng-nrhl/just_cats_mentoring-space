// 
// https://www.scala-sbt.org/1.x/docs/Basic-Def.html
// https://github.com/non/kind-projector
// https://github.com/monix/minitest#usage-in-sbt
// scalacOptions in (Compile, console) --= Seq("-Ywarn-unused:imports", "-Xfatal-warnings")
// 
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.12.8"
    )),
    name := "ip-mentoring-space",
    addCompilerPlugin(dependency = "org.spire-math" %% "kind-projector" % "0.9.9"),
    scalacOptions --= Seq("-Ywarn-unused:imports", "-Xfatal-warnings"),
    libraryDependencies ++= Seq(
      Dependencies.catsCore,
      Dependencies.catsEffect,
      Dependencies.miniTest,
      Dependencies.miniTestLaws,
      Dependencies.scalaCheck
    ),
    testFrameworks += new TestFramework(implClassNames = "minitest.runner.Framework")
  )

