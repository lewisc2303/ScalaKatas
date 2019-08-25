import org.scalatest.{FunSuite, Matchers}

class ValidBracesSpec extends FunSuite with Matchers {
  test("Tests") {
    ValidBraces.validBraces("()") shouldBe true
    ValidBraces.validBraces("[({}])") shouldBe true
    ValidBraces.validBraces("(())({}}{()][][)") shouldBe false
    ValidBraces.validBraces("}{") shouldBe false
  }

  test("hasNegative") {
    ValidBraces.hasNegative(List(0,1,3,3,1,0)) shouldBe false
    ValidBraces.hasNegative(List(0,2,3,3,1,0)) shouldBe false


  }
}

