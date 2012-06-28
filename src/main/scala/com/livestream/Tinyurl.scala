package com.livestream.tinyurl

import java.util.concurrent.atomic.AtomicLong

import scala.math.BigInt

import com.livestream.tinyurl.Base62._

class TinyURL(initUrlCounter: Long = 0) {
  private val urlToBase62Map = scala.collection.mutable.HashMap[String,String]()
  private val base62ToUrlMap = scala.collection.mutable.HashMap[String,String]()

  private val urlCounter = new AtomicLong(initUrlCounter)

  def getURLToken(url: String): String = {
    if(urlToBase62Map.contains(url)) {
      urlToBase62Map(url)
    } else {
      val newToken = base62Encode(urlCounter.getAndIncrement)
      urlToBase62Map += url -> newToken
      base62ToUrlMap += newToken -> url
      newToken
    }
  }
}
