package UsingScala

import scala.io.Source

object ReadingFile {
  println("*** The content of the file you read is:")
  Source.fromFile("ReadingFile.scala").foreach {
    print
  }
}
