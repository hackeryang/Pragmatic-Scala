package FromJavaToScala

object ArgType {
  def function(input: Int*): Unit = println(input.getClass)

  function(1,2,3)
}
