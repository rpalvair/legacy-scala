package com.palvair.scala

import _root_.scala.io.Source


/**
 * Created by rpalvair on 23/12/2014.
 */
class CustomFileReader {
  def readFile(fileName: String): Unit = {
    val lines = Source.fromFile(fileName).getLines
    for (line <- lines) {
      println("line = [" + line + "]")
    }
  }
}
