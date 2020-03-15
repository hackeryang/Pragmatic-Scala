package UnitTesting

class WordScorer(val spellChecker: SpellChecker) {
  private val VOWELS = List('a', 'e', 'i', 'o', 'u')

  def score(word: String): Int = {
    if (spellChecker.isCorrect(word))
      (0 /: word) { (total, letter) =>
        total + (if (VOWELS.contains(letter)) 1 else 2)
      }
    else
      0
  }
}
