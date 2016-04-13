package com.pramati.lang

/**
  * Created by lakshmanar on 13/4/16.
  */
import scala.collection.mutable.Stack

class Tower {

  val tower: Stack[Int] = Stack()

  def addDisc(inputDisc: Int): Boolean = {
    if (tower.size == 0) {
      tower.push(inputDisc)
      true
    } else {
      val temp: Int = tower.top
      if (inputDisc <= temp) {
        tower.push(inputDisc)
        true
      } else {
        false
      }

    }
  }

  def getDisc: Int = tower.pop

  def isEmpty: Boolean = tower.isEmpty

  override def toString = tower.toString

  def size: Int = tower.size
}
