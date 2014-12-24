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
  customFileReader.readFile("README.md")
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
  println("===============================")
  println("Destroying application...")
}
