package FunctionValuesAndClosures

object Inject2 {
  val array = Array(2, 3, 5, 1, 6, 4)

  val sum = array.foldLeft(0) { (sum, elem) => sum + elem }
  val max = array.foldLeft(Integer.MIN_VALUE) { (large, elem) => Math.max(large, elem) }

  val sum1 = (0 /: array) ((sum, elem) => sum + elem)
  val max1 = (Integer.MIN_VALUE /: array) { (large, elem) => Math.max(large, elem) }

  println(s"Sum of elements in array is $sum")
  println(s"Max of elements in array is $max")
}
