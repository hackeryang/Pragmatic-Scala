package WorkingWithObjects

object Person {

  class Person(val firstName: String, val lastName: String) {  //主构造器
    var position: String = _

    println(s"Creating $toString")  //主构造器中除方法以外的所有代码都会执行

    def this(firstName: String, lastName: String, positionHeld: String) {  //辅助构造器
      this(firstName, lastName)  //辅助构造器内第一行必须调用主构造器或其他辅助构造器
      position = positionHeld
    }

    override def toString: String = {
      s"$firstName $lastName holds $position position"
    }
  }

  val john = new Person("John", "Smith", "Analyst")
  println(john)
  val bill = new Person("Bill", "Walker")
  println(bill)
}
