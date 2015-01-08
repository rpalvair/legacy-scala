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

  def and(source: Int, value: Int): Int = {
    println("Running and : " + source + " & " + value)
    source & value
  }

  def or(source: Int, value: Int): Int = {
    println("Running or : " + source + " | " + value)
    source | value
  }
}
