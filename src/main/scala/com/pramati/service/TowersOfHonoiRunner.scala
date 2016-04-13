package com.pramati.service

/**
  * Created by lakshmanar on 13/4/16.
  */
import com.pramati.lang.Tower
import com.pramati.util.Util

object TowersOfHanoiRunner {
  val destination: Tower = new Tower()
  val source: Tower = new Tower()
  val temp: Tower = new Tower()
  val hanoi: TowersOfHanoi = new TowersOfHanoi()
  val util: Util = new Util()

  def main(args: Array[String]) {
    var choice:Int = 0
    do {
      choice = util.readChoice();
      processUserChoice(choice);
    }while (choice !=0);
  }

  def processUserChoice(choice: Int): Unit = {
    choice match {
      case 1 =>

        var value = 0
        do {
          value = util.readInput();
          val addDisc = source.addDisc(value);
          if (!addDisc) {
            println("Your input is not added to tower " + value);
          }
        } while (value != 0);

        println("your entered values are " + source);

      case 2 =>
        hanoi.moveDisc(source.size, source, destination, temp);
        println("your destination is " + destination);
        println("your source is " + source);
        println("your temp is " + temp);
      case 0 =>
        println("Thank you run again...");

    }
  }

}