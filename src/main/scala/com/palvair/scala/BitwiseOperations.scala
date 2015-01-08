package com.palvair.scala

/**
 * Created by rpalvair on 05/01/2015.
 */
class BitwiseOperations {

  def shiftLeft(source: Int, shift: Int): Int = {
    println("Running shilfLetf : " + source + " << " + shift)
    source << shift
  }

  def shiftRight(source: Int, shift: Int): Int = {
    println("Running shiftRight : " + source + " >> " + shift)
    source >> shift
  }
}
