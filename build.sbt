seq(webSettings :_*)

libraryDependencies ++= Seq( 
  "org.scalatra" %% "scalatra" % "2.0.4",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "container",
  "com.weiglewilczek.slf4s" %% "slf4s" % "1.0.7",
  "org.scalatest" %% "scalatest" % "1.8" % "test"
)

