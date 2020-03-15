package UsingScala

import scala.io._

object ConsoleInput {
  print("Please enter a ticker symbol:")
  val symbol = StdIn.readLine()
  println(s"OK, got it, you own $symbol")
}
