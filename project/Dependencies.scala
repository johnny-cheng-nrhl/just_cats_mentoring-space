//
// https://www.scala-sbt.org/1.x/docs/Library-Dependencies.html#Managed+libraryDependencies
//
// https://typelevel.org/cats
// https://typelevel.org/cats-effect/
// https://github.com/monix/minitest
// http://scalacheck.org
//

import sbt._

object Dependencies {
  // Library Versions
  val catsVersion       = "1.5.0"
  val catsEffectVersion = "1.2.0"
  val miniTestVersion   = "2.3.2"
  val scalaCheckVersion = "1.14.0"

  // Libraries
  val catsCore     = "org.typelevel"  %% "cats-core"     % catsVersion
  val catsEffect   = "org.typelevel"  %% "cats-effect"   % catsEffectVersion
  val miniTest     = "io.monix"       %% "minitest"      % miniTestVersion   % "test"
  val miniTestLaws = "io.monix"       %% "minitest-laws" % miniTestVersion   % "test"
  val scalaCheck   = "org.scalacheck" %% "scalacheck"    % scalaCheckVersion % "test"
}