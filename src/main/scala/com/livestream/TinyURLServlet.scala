package com.livestream.tinyurl

import org.scalatra._

//import com.weiglewilczek.slf4s._

class TinyURLServlet extends ScalatraServlet {
  get("/") {
    params.get("url") match {
      case Some(url) =>
        println("URL: %s".format(url))
        url
      case None =>
        println("NoParamUrl")
        "NoParam"
    }
  }
}
