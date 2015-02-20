package com.palvair.scala

/**
 * Created by rpalvair on 24/12/2014.
 */
object Application extends App {
  println("Running application...")
  val listLearner: ListLearner = new ListLearner
  listLearner.arrayInitialization()
  listLearner.initList()
  listLearner.listConcatenation()
  listLearner.parameterizeArray()

  val customFileReader: CustomFileReader = new CustomFileReader
  if (args != null && args.length > 0) {
    customFileReader.readFile(args(0))
  }
  val answer: Answer = new Answer
  answer.answer("Widdy")
  val loopLearner: LoopLearner = new LoopLearner
  loopLearner.executeForEach(Array("I", "Like", "Scala"))
  val bitwiseOperations = new BitwiseOperations
  val shifLeft = bitwiseOperations.shiftLeft(1, 2)
  val shiftRight = bitwiseOperations.shiftRight(2, 1)
  val and = bitwiseOperations.and(2, 1)
  val or = bitwiseOperations.or(2, 1)
  val rational = new Rational(1, 5)
  println("rational = " + rational)
  println("===============================")
  val lambdaLearner = new LambdasLearner
  val result = lambdaLearner.apply("billy",_.toUpperCase)
  println("lambdaResult = "+result)
  println("===============================")
  println("Destroying application...")
}
