package com.livestream.tinyurl

import org.scalatra._

import com.weiglewilczek.slf4s._

class TinyURLServlet extends ScalatraServlet with Logging {
  get("/") {
    params.get("url") match {
      case Some(url) =>
        logger.info("URL: %s".format(url))
        url
      case None =>
        logger.warn("NoParamUrl")
        "NoParam"
    }
  }
}
