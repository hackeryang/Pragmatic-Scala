package UsingScala

import scala.xml._

object ReadWriteXML {
  val stocksAndUnits = XML load "stocks.xml"
  println(stocksAndUnits.getClass)
  println(s"File has ${(stocksAndUnits \\ "symbol").size} symbol elements")

  val stocksAndUnitsMap =
    (Map[String, Int]() /: (stocksAndUnits \ "symbol")) { (map, symbolNode) =>
      val ticker = (symbolNode \ "@ticker").toString
      val units = (symbolNode \ "units").text.toInt
      map + (ticker -> units) // 返回一个新的Map，其中新增了这个映射
    }

  println(s"Number of symbol elements found is ${stocksAndUnitsMap.size}")

  /*val updatedStocksAndUnitsXML =
    <symbols>
      {stocksAndUnitsMap map updatedStocksAndUnitsXML}
    </symbols>*/

  def updateUnitsAndCreateXML(element: (String, Int)) = {
    val (ticker, units) = element
    <symbol ticker={ticker}>
      <units>
        {units + 1}
      </units>
    </symbol>
  }

  //XML save("stocks2.xml", updatedStocksAndUnitsXML)

  val elementsCount = (XML.load("stocks2.xml") \\ "symbol").size
  println(s"Saved file has $elementsCount symbol elements")
}
