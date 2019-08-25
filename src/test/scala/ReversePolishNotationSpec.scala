import org.scalatest.{FlatSpec, Matchers}

class ReversePolishNotationSpec extends FlatSpec with Matchers {
  it should "add 1 and 1 numbers together" in {
    val inputArray = "1 1 +"
    ReversePolishNotation.reversePolish(inputArray) shouldBe 2
  }

  it should "add 1 and 2 numbers together" in {
    val inputArray = "1 2 +"
    ReversePolishNotation.reversePolish(inputArray) shouldBe 3
  }

  it should "multiply 2 and 2 together" in {
    val inputArray = "2 2 *"
    ReversePolishNotation.reversePolish(inputArray) shouldBe 4
  }

  it should "divide 4 by 2" in {
    val inputArray = "4 2 /"
    ReversePolishNotation.reversePolish(inputArray) shouldBe 2
  }

  it should "subtract 2 from 4" in {
    val inputArray = "4 2 -"
    ReversePolishNotation.reversePolish(inputArray) shouldBe 2
  }

  it should "multiply 2 and 2 and add 4" in {
    val inputArray = "2 2 * 4 +"
    ReversePolishNotation.reversePolish(inputArray) shouldBe 8
  }

  it should "multiply 22 and 2 and add 4" in {
    val inputArray = "22 2 * 4 +"
    ReversePolishNotation.reversePolish(inputArray) shouldBe 48
  }

  it should "multiply 2 and 6 then add 5 then divide 4 and minus 5" in {
    val inputArray = "2 6 * 6 + 3 / 5 -"
    ReversePolishNotation.reversePolish(inputArray) shouldBe 1
  }

//  it should "throw custom error message when incorrect string given" in {
//    val inputArray = "2 + 6 + 6 + 3 / 5"
//    ReversePolishNotation.reversePolish(inputArray) should
//  }



}
