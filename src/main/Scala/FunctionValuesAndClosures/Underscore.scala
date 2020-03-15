package FunctionValuesAndClosures

object Underscore {
  val arr = Array(1, 2, 3, 4, 5)

  val total = (0 /: arr) { (sum, elem) => sum + elem }

  val total1 = (0 /: arr) {
    _ + _
  }

  val negativeNumberExists1 = arr.exists { elem => elem < 0 }
  val negativeNumberExists2 = arr.exists {
    _ < 0
  }

  val largest = (Integer.MIN_VALUE /: arr) { (carry, elem) => Math.max(carry, elem) }
  val largest1 = (Integer.MIN_VALUE /: arr) {
    Math.max _
  }
  val largest2 = (Integer.MIN_VALUE /: arr) {
    Math.max
  }
}
