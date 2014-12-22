

class Answer {
  def answer(name: String): Unit = {
    var message = "You called me "
    if (name != null && name.length > 0) {
      message += name
    }
    println(message)
  }
}

object Answer extends App {

  val answer = new Answer
  if (args.length > 0) {
    answer.answer(args(0))
  } else {
    answer.answer(null)
  }

  /*def main(args: Array[String]): Unit = {
    val answer = new Answer
    if (args.length > 0) {
      answer.answer(args(0))
    } else {
      answer.answer(null)
    }
  }*/

}