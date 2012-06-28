import org.scalatest.FunSuite

import com.livestream.tinyurl.TinyURL

class TinyURLTest extends FunSuite {

  test("Tokens increment") {
    val tinyURL = new TinyURL

    assert(tinyURL.getURLToken("google.com") === "0")
    assert(tinyURL.getURLToken("yahoo.com") === "1")
    assert(tinyURL.getURLToken("nyt.com") === "2")
    assert(tinyURL.getURLToken("facebook.com") === "3")
    assert(tinyURL.getURLToken("techmeme.com") === "4")
  }

  test("Return same token for url") {
    val tinyURL = new TinyURL(3425953)

    val googleToken = tinyURL.getURLToken("google.com")

    assert(tinyURL.getURLToken("google.com") === googleToken)
  }
}
