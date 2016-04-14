package com.pramati.service

import org.scalatest.FunSuite
import com.pramati.lang.Tower
import com.pramati.service.TowersOfHanoi


/**
  * Created by lakshmanar on 14/4/16.
  */
class TowersOfHanoiTest extends FunSuite {

  test("MoveDiscs method should move all discs from source tower to destination at the final source and destination tower should have same disc and in same order") {
    val sourceTower = new Tower
    val destinationTower = new Tower
    val tempTower = new Tower
    val thanoi = new TowersOfHanoi
    sourceTower.addDisc(10)
    sourceTower.addDisc(9)
    sourceTower.addDisc(7)
    sourceTower.addDisc(6)
    val inputTower = new Tower
    inputTower.addDisc(10)
    inputTower.addDisc(9)
    inputTower.addDisc(7)
    inputTower.addDisc(6)
    thanoi.moveDisc(sourceTower.size, sourceTower, destinationTower, tempTower)

    assert(inputTower.toString === destinationTower.toString)


  }
}
