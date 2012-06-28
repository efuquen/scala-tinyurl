package com.livestream.tinyurl

import scala.math.BigInt

object Base62 {

  private val alphabet = List(
    "0","1","2","3","4","5","6","7","8","9",
    "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
    "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z")

  def base62Encode(num: BigInt): String = {
    if(num == 0) {
      alphabet(0) 
    } else {
      val result = new StringBuilder
      var curNum = num
      while( curNum > 0 ) {
        val rem = curNum % 62
        curNum = curNum / 62
        result.append(alphabet(rem.toInt))
      }

      result.reverse.toString
    }
  }
}
