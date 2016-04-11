

object TowersOfHanoi {
  /**
   * @param discount
   * @param sourceTower
   * @param auxilary
   * @param destinationTower
   * Which is used to make discs in order
   *
   * Important Note: If we Use tail recursion we can avoid the stack over flow problem. But in our case it is not possible
   *  to convert recursive function to tail recursive function.
   */

  def makeInOrder(discCount: Int, source: String, auxilary: String, destination: String) {
    // If disc is last one simply place disc from source to destination.
    if (discCount == 1) {
      println("Disc " + discCount + " is placed from " + source + "---->" + destination)
    } else {
      // If discs are more than one then copy all n-1 discs from source tower to auxilary (temparary tower)
      makeInOrder(discCount - 1, source, destination, auxilary)
      println("Disc " + discCount + " is placed from " + source + "---->" + destination)
      // Please discs from auxilury tower to destination tower.
      makeInOrder(discCount - 1, auxilary, source, destination)
    }
  }

  def main(args: Array[String]) {
    var disc = 0;
    do {
      try {
        println("Enter Discs Count more than 0 and less than 2147483647 value")
        // reading discs count as input from user.
        disc = readInt()

        if (disc > 2147483647) {
          println("Your disc count is exceeds the limit please enter valid value.")
        }
      } catch {
        case ex: NumberFormatException => { // if data entered by user is invalid handle it. 
          disc = 0;
          println("Please enter valid input")
        }
        case ex: StackOverflowError => { // if data entered by user is more than system can process handle it. 
          disc = 0;
          println("Please enter lesser values as your system can not process your input please try again...")
        }
      }
    } while (disc <= 0); // repeating the process untill user enters proper input value.
    makeInOrder(disc, "A", "B", "C") // calling to process discs in towers of Hanoi model with tower names as A, B , C
  }
}
