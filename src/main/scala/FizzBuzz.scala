object FizzBuzz {

  def fizzbuzz(number: Int) = number match {
    case _ if isDivisibleBy3And5(number) => "FizzBuzz"
    case _ if isDivisibleBy3(number) => "Fizz"
    case _ if isDivisibleBy5(number) => "Buzz"
    case _ => number
  }

  def isDivisibleBy3(number: Int) :Boolean = {
    number % 3 == 0
  }

  def isDivisibleBy5(number: Int) :Boolean = {
    number % 5 == 0
  }

  def isDivisibleBy3And5(number: Int) :Boolean = {
    isDivisibleBy3(number) && isDivisibleBy5(number)
  }



}