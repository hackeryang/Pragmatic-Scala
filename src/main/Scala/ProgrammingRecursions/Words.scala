package ProgrammingRecursions

import scala.io.Source._

object Words {
  def explore(count: Int, words: List[String]): Int =
    if (words.isEmpty)
      count
    else
      countPalindrome(count, words)

  def countPalindrome(count: Int, words: List[String]): Int = {
    val firstWord = words.head

    if (firstWord.reverse == firstWord)
      explore(count + 1, words.tail)
    else
      explore(count, words.tail)
  }

  def callExplore(text: String): Unit = println(explore(0, text.split(" ").toList))

  callExplore("Dad mom and racecar")

  try {
    val text =
      fromURL("https://en.wikipedia.org/wiki/Gettysburg_Address").mkString
    callExplore(text)
  } catch {
    case ex: Throwable => println(ex)
  }
}
