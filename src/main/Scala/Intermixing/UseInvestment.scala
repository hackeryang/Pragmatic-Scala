package Intermixing

object UseInvestment extends App {
  val investment = new Investment("XYZ Corporation", InvestmentType.STOCK)
  println(investment.getClass)
  val theYield1 = investment.`yield`
  val theYield2 = investment.`yield`()
}
