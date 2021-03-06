

package com.palvair.scala {


/**
 * Created by rpalvair on 19/12/2014.
 */
class HelloWorld {

  def answer(): Unit = {
    println("You called me?");
  }

  def readFile(): Unit = {
    val reader = new CustomFileReader
    reader.readFile("README.md")
  }

  def callListLearner(): Unit = {
    val listLearner = new ListLearner
    listLearner.arrayInitialization()
    listLearner.initList()
    listLearner.listConcatenation()
    listLearner.listPrepend("widdy says : ")
    listLearner.parameterizeArray()
  }
}

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val helloWorld = new HelloWorld
    helloWorld.answer()
    helloWorld.readFile()
    helloWorld.callListLearner()
  }

}

}



