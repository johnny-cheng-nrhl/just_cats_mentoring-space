// https://www.scala-sbt.org/1.x/docs/Using-Plugins.html
//
// sbt-coursier (dependency resolver / fetcher)
// https://github.com/coursier/coursier#sbt-plugin
//
// sbt-updates (SBT plugin that can check Maven and Ivy repositories for dependency updates)
// https://github.com/rtimush/sbt-updates
//
// sbt-tpolecat (tpolecat's scalac recommended options and sbt-partial-unification)
// https://github.com/DavidGregory084/sbt-tpolecat
// https://github.com/DavidGregory084/sbt-tpolecat#scalac-options-for-the-enlightened
// https://tpolecat.github.io/2017/04/25/scalac-flags.html
//
// https://scalacenter.github.io/scalafix/
//
// A scala compiler plugin for more concise errors
// This plugin removes some of the redundancy of the compiler output
// and prints additional info for implicit resolution errors.
// https://github.com/tek/splain
//
addSbtPlugin(dependency = "io.get-coursier"           % "sbt-coursier" % "1.0.3")
addSbtPlugin(dependency = "com.timushev.sbt"          % "sbt-updates"  % "0.4.0")
addSbtPlugin(dependency = "io.github.davidgregory084" % "sbt-tpolecat" % "0.1.5")
addSbtPlugin(dependency = "ch.epfl.scala"             % "sbt-scalafix" % "0.9.4")
addCompilerPlugin(dependency = "io.tryp" % "splain" % "0.4.0" cross CrossVersion.patch)