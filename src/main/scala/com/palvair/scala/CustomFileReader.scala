
import scala.io.Source

package com.palvair.scala {

import java.io.FileNotFoundException

/**
 * Created by rpalvair on 23/12/2014.
 */
class CustomFileReader {
  def readFile(fileName: String): Unit = {
    val source: Source = this.getSource(fileName)
    if (source != null) {
      val lines = source.getLines()
      for (line <- lines) {
        println("line = [" + line + "]")
      }
    }
  }

  def getSource(fileName: String): Source = {
    var source: Source = null
    val url = getClass.getClassLoader.getResource(fileName)
    if (url != null) {
      source = Source.fromURL(url)
    } else {
      try {
        source = Source.fromFile(fileName)
      } catch {
        case e: FileNotFoundException => {
          println("exception = " + e.getLocalizedMessage)
        }
      }
    }
    source
  }
}

}







