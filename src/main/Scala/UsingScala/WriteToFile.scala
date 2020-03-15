package UsingScala

import java.io._

object WriteToFile {
  val writer = new PrintWriter(new File("symbols.txt"))
  writer write "AAPL"
  writer.close()
  println(scala.io.Source.fromFile("symbols.txt").mkString)
}
