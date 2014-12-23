class ListLearner {
  def parameterizeArray(): Unit = {
    println("parameterizeArray")
    val array = new Array[String](3)
    array.update(0, "Salut")
    array.update(1, "mon")
    array.update(2, "pote")
    for (i <- 0.to(array.length - 1)) {
      println(array.apply(i))
    }
  }

  def arrayInitialization(): Unit = {
    println("arrayInitialization")
    val array = Array.apply("Salut", "mon", "pote");
    for (i <- 0.to(array.length - 1)) {
      println(array(i))
    }
  }
}

object ListLearner extends App {
  val listLearner = new ListLearner
  listLearner.parameterizeArray()
  listLearner.arrayInitialization
}