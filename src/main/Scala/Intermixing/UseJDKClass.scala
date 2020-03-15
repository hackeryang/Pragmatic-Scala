package Intermixing

import java.util.Currency

object UseJDKClass {
  val currencies = Currency.getAvailableCurrencies
  println(s"${currencies.size} currencies are available.")
}
