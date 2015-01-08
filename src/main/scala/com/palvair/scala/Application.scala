package com.palvair.scala

/**
 * Created by rpalvair on 24/12/2014.
 */
object Application extends App {
  println("Running application...")
  println("===============================")
  println("Run ListLearner...")
  println("===============================")
  val listLearner: ListLearner = new ListLearner
  listLearner.arrayInitialization()
  listLearner.initList()
  listLearner.listConcatenation()
  listLearner.parameterizeArray()
  println("===============================")
  println("Run CustomFileReader...")
  println("===============================")
  val customFileReader: CustomFileReader = new CustomFileReader
  if (args != null && args.length > 0) {
    customFileReader.readFile(args(0))
  }

  println("===============================")
  println("Run Answer")
  println("===============================")
  val answer: Answer = new Answer
  answer.answer("Widdy")
  println("===============================")
  println("Run LoopLearner")
  println("===============================")
  val loopLearner: LoopLearner = new LoopLearner
  loopLearner.executeForEach(Array("I", "Like", "Scala"))

  val bitwiseOperations = new BitwiseOperations
  println("===============================")
  val shifLeft = bitwiseOperations.shiftLeft(1, 2)
  println("result = " + shifLeft)
  println("===============================")
  val shiftRight = bitwiseOperations.shiftRight(2, 1)
  println("result = " + shiftRight)
  println("===============================")
  println("Destroying application...")
}
