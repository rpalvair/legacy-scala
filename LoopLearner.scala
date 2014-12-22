

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

  def executeFor(args: Array[String]): Unit = {
    println("execute for")
    if (args != null) {
      for (i <- 0 to args.length - 1) {
        println("arg {" + i + "} = " + args(i));
      }
    }
  }

  def executeFor2(args: Array[String]): Unit = {
    println("execute for2")
    if (args != null) {
      for (arg <- args) {
        println("arg = " + arg);
      }
    }
  }

  def executeForEach(args: Array[String]): Unit = {
    println("execute forEach")
    if (args != null) {
      args.foreach((arg: String) => println("arg : " + arg))
    }
  }
}

object LoopLearner extends App {

  val loopLearner = new LoopLearner
  if (args.length > 0) {
    loopLearner.executeWhile(args)
    loopLearner.executeFor(args)
    loopLearner.executeFor2(args)
    loopLearner.executeForEach(args)
  } else {
    loopLearner.executeWhile(null)
    loopLearner.executeFor(null)
    loopLearner.executeFor2(null)
    loopLearner.executeForEach(null)
  }
}


