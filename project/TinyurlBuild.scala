import sbt._
import sbt.Keys._

object TinyurlBuild extends Build {

  lazy val tinyurl = Project(
    id = "tinyurl",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "tinyurl",
      organization := "com.livestream",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.1"
      // add other settings here
    )
  )
}
