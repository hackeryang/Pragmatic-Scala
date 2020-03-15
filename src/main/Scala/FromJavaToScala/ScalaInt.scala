package FromJavaToScala

class ScalaInt {
  def playWithInt(): Unit = {
    val capacity: Int = 10
    val list = new java.util.ArrayList[String]
    list.ensureCapacity(capacity)
  }
}
