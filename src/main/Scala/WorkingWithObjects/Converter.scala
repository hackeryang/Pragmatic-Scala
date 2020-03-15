package WorkingWithObjects

import Currency._

object Converter {
  def convert(money: Money, to: Currency): Money = {
    //获取当前市场汇率。。。这里用到了模拟值
    val conversionRate = 2
    new Money(money.amount * conversionRate, to)
  }
}
