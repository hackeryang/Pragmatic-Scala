package UsingScala

object StockPriceFinder {

  import scala.io.Source

  case class Record(year: Int, month: Int, date: Int, closePrice: BigDecimal)

  def getLatestClosingPrice(symbol: String): BigDecimal = {
    val url = s"https://raw.githubusercontent.com/ReactivePlatform/" +
      s"Pragmatic-Scala-StaticResources/master/src/main/resources/" +
      s"stocks/daily/daily_$symbol.csv"

    val data = Source.fromURL(url).mkString
    val latestClosePrice = data.split("\n")
      .slice(1, 2)
      .map(record => {
        val Array(timestamp, open, high, low, close, volume) = record.split(",")
        val Array(year, month, date) = timestamp.split("-")
        Record(year.toInt, month.toInt, date.toInt, BigDecimal(close.trim))
      })
      .map(_.closePrice)
      .head
    latestClosePrice
  }

  def getTickersAndUnits: Map[String, Int] = {
    val classLoader = this.getClass.getClassLoader
    val stocksXMLInputStream = classLoader.getResourceAsStream("stocks.xml")
    //或者来自于文件
    val stocksAndUnitsXML = scala.xml.XML.load(stocksXMLInputStream)
    (Map[String, Int]() /: (stocksAndUnitsXML \ "symbol")) {
      (map, symbolNode) =>
        val ticker = (symbolNode \ "@ticker").toString
        val units = (symbolNode \ "units").text.toInt
        map + (ticker -> units)
    }
  }
}
