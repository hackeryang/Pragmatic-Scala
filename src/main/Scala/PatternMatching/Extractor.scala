package PatternMatching

object Extractor {

  object StockService {
    def process(input: String): Unit = {
      input match {
        case Symbol() => println(s"Look up price for valid symbol $input")
        case ReceiveStockPrice(symbol @ Symbol() , price) =>
          println(s"Received Price $$$price for symbol $symbol")
        case _ => println(s"Invalid input $input")
      }
    }
  }

  object Symbol {
    def unapply(symbol: String): Boolean = {
      //查找了数据库但是只识别了GOOG和IBM
      symbol == "GOOG" || symbol == "IBM"
    }
  }

  object ReceiveStockPrice {
    def unapply(input: String): Option[(String, Double)] = {
      try {
        if (input contains ":") {
          val splitQuote = input split ":"
          Some((splitQuote(0), splitQuote(1).toDouble))
        } else {
          None
        }
      } catch {
        case _: NumberFormatException => None
      }
    }
  }

  StockService process "GOOG"
  StockService process "GOOG:310.84"
  StockService process "GOOG:BUY"
  StockService process "ERR:12.21"
}
