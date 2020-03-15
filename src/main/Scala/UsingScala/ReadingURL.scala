package UsingScala

import scala.io.Source
import java.net.URL

object ReadingURL {
  val source = Source.fromURL(new URL("http://localhost"))

  println(s"What's Source?: $source")
  println(s"Raw String: ${source.mkString}")
}
