package com.pramati.lang

import org.scalatest.FunSuite

/**
  * Created by lakshmanar on 13/4/16.
  */
class TowerTest extends FunSuite {
  val tower = new Tower

  test(" Test AddDisc() : if we add first element it should return true") {
    val result = tower.addDisc(10)
    assert(result)
  }

  test(" Test AddDisc() : if we add an element it should be less than the existing one ") {
    val result = tower.addDisc(10)
    assert(result)
    val result2 = tower.addDisc(9)
    assert(result2)
  }

  test("Test addDisc() : if we add  an element which is greater than existing one it should return false") {
    val result = tower.addDisc(9)
    assert(result)
    val result2 = tower.addDisc(10)
    assert(!result2)
  }

  test("Test addDisc() : if we add  an element which is equal to existing one it should return false") {
    val result = tower.addDisc(9)
    assert(result)
    val result2 = tower.addDisc(9)
    assert(result2)
  }

  test("Test getDisc should return upper disc") {
    tower.addDisc(10)
    tower.addDisc(5)
    tower.addDisc(2)
    val disc = tower.getDisc
    assert(disc === 2)
  }

  test("Test getDisc should retrun only one disc at a time") {
    tower.addDisc(10)
    tower.addDisc(5)
    tower.addDisc(2)
    tower.getDisc
    assert(tower.size === 2)
  }
}
