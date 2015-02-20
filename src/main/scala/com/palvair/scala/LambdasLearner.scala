package com.palvair.scala

/**
 * Created by rpalvair on 20/02/2015.
 */
class LambdasLearner {

  def apply(a:String, lambda: String => String): String = {
    lambda(a)
  }
}
