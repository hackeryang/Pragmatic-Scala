package ProgrammingRecursions

object Mad {
  def mad(parameter: Int): Int = {
    if (parameter == 0)
      throw new RuntimeException("Error")
    else
      mad(parameter - 1)
  }

  mad(5)
}
