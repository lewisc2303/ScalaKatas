case class ReversePolish(accumulator: Int, number: Int, operator: Operator) {

  //make partial function safe with Option or Either
  def evaluate: Int = operator.op match {
    case "+" => accumulator + number
    case "-" => accumulator - number
    case "*" => accumulator * number
    case "/" => accumulator / number
  }
}
case class Operator(op: String)

object ReversePolishNotation {

  def convertToOperator(operator: String) = {
    val operators = Set("+", "-", "*", "/")
     if (operators.contains(operator)) Operator(operator)
     else operator
  }

  def reversePolish(inputString: String) = {
    val arrayOfString = inputString.split("").map(x=> convertToOperator(x))
    val foldString  = arrayOfString.foldLeft[ReversePolish](ReversePolish(0,0,Operator("+")))({
      case (acc:ReversePolish, " ")  =>
        acc
      case (acc:ReversePolish, index :String)  =>
        //.toInt here can fail and throw
        ReversePolish(acc.evaluate, index.toInt, Operator("+"))
      case (acc: ReversePolish, index: Operator) =>
        acc.copy(operator = index)
      case (acc: ReversePolish, _) => acc
    })
    foldString.evaluate
  }

}
