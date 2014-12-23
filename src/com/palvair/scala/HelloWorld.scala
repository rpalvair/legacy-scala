package com.palvair.scala

/**
 * Created by rpalvair on 19/12/2014.
 */
class HelloWorld {

  def answer(): Unit = {
    println("You called me?");
  }
}

object HelloWorld extends App {
  val helloWorld = new HelloWorld
  helloWorld.answer()
}
