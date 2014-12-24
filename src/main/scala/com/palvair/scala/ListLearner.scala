package com.palvair.scala {

class ListLearner {
  def parameterizeArray(): Unit = {
    println("[parameterizeArray]")
    val array = new Array[String](3)
    array.update(0, "I")
    array.update(1, "Like")
    array.update(2, "Scala")
    for (i <- 0.to(array.length - 1)) {
      println(array.apply(i))
    }
  }

  def arrayInitialization(): Unit = {
    println("[arrayInitialization]")
    val array = Array.apply("I", "Like", "Scala");
    for (i <- 0.to(array.length - 1)) {
      println(array(i))
    }
  }

  def initList(): Unit = {
    println("[initList]")
    val list = List("I", "Like", "Scala")
    for (item <- list) {
      println(item)
    }
  }

  def listConcatenation(): Unit = {
    println("[listConcatenation]")
    val list = List("I", "Like", "Scala")
    val additional = List(",", "Scala", "Is", "Better", "Than", "Java")
    val concat = list ::: additional;
    for (item <- concat) {
      println(item)
    }
  }

  def listPrepend(valueToPrepend: String): Unit = {
    println("[listPreprend]")
    println("valueToPrepend = " + valueToPrepend)
    val list = List("I", "Like", "Scala")
    val result = valueToPrepend :: list
    for (item <- result) {
      println(item)
    }
  }
}

object ListLearner {

  def main(args: Array[String]): Unit = {
    val listLearner = new ListLearner
    listLearner.parameterizeArray()
    listLearner.arrayInitialization()
    listLearner.initList()
    listLearner.listConcatenation()
    listLearner.listPrepend("Widdy says : ")
  }

}

}


