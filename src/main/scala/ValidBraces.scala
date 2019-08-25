import scala.annotation.tailrec

object ValidBraces extends App {

sealed trait Brackets

  def validBraces(s: String): Boolean = {
    @tailrec
    def loop(s: List[Char], listOfCount: List[Int]): List[Int] =  {
      s match {
        case _ if hasNegative(listOfCount) => listOfCount
        case Nil => listOfCount
        case '(' :: xs => loop(xs, updateListCount(listOfCount,0,true))
        case '[' :: xs => loop(xs, updateListCount(listOfCount,1,true))
        case '{' :: xs => loop(xs, updateListCount(listOfCount,2,true))
        case ')' :: xs => loop(xs, updateListCount(listOfCount,0,false))
        case ']' :: xs => loop(xs, updateListCount(listOfCount,1,false))
        case '}' :: xs => loop(xs, updateListCount(listOfCount,2,false))
        case _ :: xs => loop(xs, listOfCount)
      }
    }

    if (loop(s.toList, List(0, 0, 0)) == List(0,0,0)) {true} else false
  }

  def updateListCount(listCount: List[Int], elem: Int, positive: Boolean): List[Int] = {
    val change = if (positive) {1} else -1
    listCount.updated(elem, listCount(elem) + change)
  }

  def hasNegative(listCount: List[Int]): Boolean = {
    listCount.foldLeft(false){
      case (acc,_) if acc => true
      case (_,count) if count < 0 => true
      case (_,_) => false
    }
  }

}
