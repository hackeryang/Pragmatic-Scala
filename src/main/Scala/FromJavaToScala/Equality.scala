package FromJavaToScala

object Equality {
  val str1 = "hello"
  val str2 = "hello"
  val str3 = new String("hello")

  println(str1 == str2) //等价于Java的str1.equals(str2)
  println(str1 eq str2) //等价于Java的str1 == str2
  println(str1 == str3)
  println(str1 eq str3)
}
