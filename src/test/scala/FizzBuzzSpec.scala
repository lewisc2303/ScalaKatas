import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {
  it should "return 1 when 1 is inputted" in {
    FizzBuzz.fizzbuzz(1) shouldBe 1
  }

  it should "return Fizz when 3" in {
    FizzBuzz.fizzbuzz(3) shouldBe "Fizz"
  }

  it should "return Buzz when 5" in {
    FizzBuzz.fizzbuzz(5) shouldBe "Buzz"
  }

  it should "return Fizz when 6" in {
    FizzBuzz.fizzbuzz(6) shouldBe "Fizz"
  }

  it should "return Fizz when 10" in {
    FizzBuzz.fizzbuzz(10) shouldBe "Buzz"
  }

  it should "return FizzBuzz when 15" in {
    FizzBuzz.fizzbuzz(15) shouldBe "FizzBuzz"
  }
}
