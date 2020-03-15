package Introduction

import scala._
import scala.collection.parallel.CollectionConverters._

object TopStock {
  val symbols = List("AMD", "AAPL", "AMZN", "IBM", "ORCL", "MSFT")
  val year = 2017

  val (topStock, topPrice) =
    symbols.par.map { ticker => (ticker, getYearEndClosingPrice(ticker, year)) } //并行遍历股票代码，创建List((股票代码1，价格1)，（股票代码2，价格2）...)
      .maxBy { stockPrice => stockPrice._2 } //匹配上面map生成的List中的每个第2个属性即价格，取最大值

  printf(s"Top stock of $year is $topStock closing at price $$$topPrice")

  case class Record(year: Int, month: Int, date: Int, closePrice: BigDecimal)

  def getYearEndClosingPrice(symbol: String, year: Int): BigDecimal = {
    val url = s"https://raw.githubusercontent.com/ReactivePlatform/" +
      s"Pragmatic-scala-StaticResources/master/src/main/resources/" +
      s"stocks/daily/daily_$symbol.csv"

    val data = io.Source.fromURL(url).mkString
    val maxClosePrize = data.split("\n")
      .filter(record => record.startsWith(s"$year-12"))
      .map(record => {
        val Array(timestamp, open, high, low, close, volume) = record.split(",")
        val Array(year, month, date) = timestamp.split("-")
        Record(year.toInt, month.toInt, date.toInt, BigDecimal(close.trim))
      })
      .sortBy(_.date)(Ordering[Int].reverse)
      .take(1)
      .map(_.closePrice)
      .head
    maxClosePrize
  }
}
