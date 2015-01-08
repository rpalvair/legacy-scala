package com.palvair.scala

/**
 * Created by rpalvair on 08/01/2015.
 */
class Rational(n: Int, d: Int) {
  require(d != 0)
  println("creating new rational")
  val numer: Int = n
  val denom: Int = d

  def this(n: Int) = this(n, 1);

  override def toString = numer + "/" + denom

  def add(input: Rational): Rational = {
    new Rational(
      this.numer * input.denom + input.numer * this.denom,
      this.denom * input.denom
    )
  }
}
