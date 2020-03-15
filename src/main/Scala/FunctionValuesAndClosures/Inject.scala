package FunctionValuesAndClosures

object Inject {
  def printValue(generator: () => Int): Unit = {
    println(s"Generated value is ${generator()}")
  }

  def inject(arr: Array[Int], initial: Int, operation: (Int, Int) => Int) = {
    var carryOver = initial
    arr.foreach(element => carryOver = operation(carryOver, element))
    carryOver
  }

  val array = Array(2, 3, 5, 1, 6, 4)
  val sum = inject(array, 0, (carry, elem) => carry + elem)
  println(s"Sum of elements in array is $sum")
  val max = inject(array, Integer.MIN_VALUE, (carry, elem) => Math.max(carry, elem))
  println(s"Max of elements in array is $max")
}
