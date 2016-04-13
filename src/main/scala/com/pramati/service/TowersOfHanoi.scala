package com.pramati.service

/**
  * Created by lakshmanar on 13/4/16.
  */
import com.pramati.lang.Tower
class TowersOfHanoi {
  def moveDisc(n: Int, from: Tower, to: Tower, inner: Tower): Unit = {
    if (n == 1) {
      to.addDisc(from.getDisc)
    } else {
      moveDisc(n - 1, from, inner, to)
      to.addDisc(from.getDisc)
      moveDisc(n - 1, inner, to, from)
    }
  }
}
