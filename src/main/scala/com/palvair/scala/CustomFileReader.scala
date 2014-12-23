package com.palvair.scala

import scala.io.Source._

/**
 * Created by rpalvair on 23/12/2014.
 */
class CustomFileReader {
  def readFile(fileName: String): Unit = {
    val lines = fromFile(fileName).getLines
    for (line <- lines) {
      println("line = [" + line + "]")
    }
  }
}
