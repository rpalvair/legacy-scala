
import scala.io.Source

package com.palvair.scala {

/**
 * Created by rpalvair on 23/12/2014.
 */
class CustomFileReader {
  def readFile(fileName: String): Unit = {
    val source: Source = getSource(fileName)
    val lines = source.getLines()
    for (line <- lines) {
      println("line = [" + line + "]")
    }
  }

  def getSource(fileName: String): Source = {
    try {
      val url = getClass.getClassLoader.getResource(fileName)
      Source.fromURL(url)
    } catch {
      case e: Exception => {
        println(e.getMessage)
        Source.fromFile("../" + fileName)
      }
    }
  }
}

}







