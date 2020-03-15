package WorkingWithObjects

import scala.collection._

object Static {

  class Marker private(val color: String) {
    override def toString = s"marker color $color"
  }

  object Marker {
    private val markers = mutable.Map(
      "red" -> new Marker("red"),
      "blue" -> new Marker("blue"),
      "yellow" -> new Marker("yellow")
    )

    def supportedColors: Iterable[String] = markers.keys

    def apply(color: String): Marker = markers.getOrElseUpdate(color, op = new Marker(color))
  }

  println(s"Supported colors are: ${Marker.supportedColors}")
  println(Marker("blue"))
  println(Marker("red"))
}
