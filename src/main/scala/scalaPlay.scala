
trait EvaluationStrategiesForError{

  def error(): Unit = {
    throw new Exception
  }
  def callByValue(arg: Any): Unit = {
    println("output")
  }

  def callByName(arg: => Any): Unit = {
    println("output")
  }

  def callByNeed(arg: => Any): Unit = {
    lazy val byNeedValue = arg
    println(byNeedValue)
    println(byNeedValue)
  }
}

trait EvaluationStrategies{

  def error(): Unit = {
    throw new Exception
  }

  def something(): Int = {
    println("calling...")
    42
  }

  def callByValue(arg: Any): Unit = {
    println(arg)
    println(arg)
  }

  def callByName(arg: => Any): Unit = {
    println(arg)
    println(arg)
  }

  def callByNeed(arg: => Any): Unit = {
    lazy val byNeedValue = arg
    println(byNeedValue)
    println(byNeedValue)
  }
}

object evaluationCache extends App with EvaluationStrategies {
  println("callByValue: ")
  callByValue(something())

  println("\ncallByName: ")
  callByName(something())


  println("\ncallByNeed: ")
  callByNeed(something())
}

object evaluationErrors extends App with EvaluationStrategiesForError {
  println("callByName: ")
  callByName(error())

  println("\ncallByValue: ")
  callByValue(error())

}