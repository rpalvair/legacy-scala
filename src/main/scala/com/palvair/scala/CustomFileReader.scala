
import scala.io.Source

package com.palvair.scala {

/**
 * Created by rpalvair on 23/12/2014.
 */
class CustomFileReader {
  def readFile(fileName: String): Unit = {
    var source: Source = null
    try {
      val url = getClass.getClassLoader.getResource(fileName)
      source = Source.fromURL(url)
    } catch {
      case e: Exception => {
        println(e.getMessage)
        source = Source.fromFile("../" + fileName)
      }
    }
    val lines = source.getLines()
    for (line <- lines) {
      println("line = [" + line + "]")
    }
  }

}

}







