package com.pramati.util

/**
  * Created by lakshmanar on 13/4/16.
  */
class Util {
  def readInput(): Int = {
    println("Enter Your value . Press 0 to Exit ")
    readInt
  }

  def readChoice(): Int = {
    println("Enter Your choice : 1 is for inserting elements into tower. 2 is for moving disc from source to destination.And Press 0 to Exit:  ");
    readInt
  }
}
