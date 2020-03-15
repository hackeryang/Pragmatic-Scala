package FromJavaToScala

object MultipleAssignment {
  def getPersonInfo(primaryKey: Int) = {
    //假定primaryKey是用来获取用户信息的主键
    //这里响应体是固定的
    ("Venkat", "Subramaniam", "venkats@agiledeveloper.com")
  }

  val (firstName, lastName, emailAddress) = getPersonInfo(1)

  println(s"First Name: $firstName")
  println(s"Last Name: $lastName")
  println(s"Email Address: $emailAddress")
}
