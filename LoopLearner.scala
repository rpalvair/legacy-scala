

/**
 * Created by rpalvair on 22/12/2014.
 */
class LoopLearner {

  def executeWhile(args: Array[String]): Unit = {
    println("execute while")
    if (args != null) {
      var i = 0;
      while (i < args.length) {
        println("arg {" + i + "} = " + args(i))
        i += 1
      }
    }
  }
}

object LoopLearner extends App {

  val loopLearner = new LoopLearner
  if (args.length > 0) {
    loopLearner.executeWhile(args)
  } else {
    loopLearner.executeWhile(null)
  }
}


