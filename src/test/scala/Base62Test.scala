import org.scalatest.FunSuite

import com.livestream.tinyurl.Base62._

class Base62Test extends FunSuite {

  /*
  test("Decimal equals Base62 ") {
    assert(base62Encode() === "")
  }
  */

  test("Decimal 0 equals Base62 0") {
    assert(base62Encode(0) === "0")
  }

  test("Decimal 9 equals Base62 9") {
    assert(base62Encode(9) === "9")
  }

  test("Decimal 10 equals Base62 a") {
    assert(base62Encode(10) === "a")
  }

  test("Decimal 100 equals Base62 1C") {
    assert(base62Encode(100) === "1C")
  }

  test("Decimal 307894 equals Base62 1i62") {
    assert(base62Encode(307894) === "1i62")
  }

  test("Decimal 5482963291 equals Base62 5Z3XdN") {
    assert(base62Encode(5482963291L) === "5Z3XdN")
  }
}
