package FromJavaToScala

object ImplicitParameters {

  class Wifi(name: String) {
    override def toString: String = name
  }

  def connectToNetwork(user: String)(implicit wifi: Wifi): Unit = {  //隐式变量单独放在另一个括号里
    println(s"User: $user connected to WIFI $wifi")
  }

  def atOffice(): Unit = {
    println("--- at the office ---")

    implicit def officeNetwork: Wifi = new Wifi("office-network")

    val cafeteriaNetwork = new Wifi("cafe-connect")

    connectToNetwork("guest")(cafeteriaNetwork)
    connectToNetwork("Jill Coder")
    connectToNetwork("Joe Hacker")
  }

  def atJoesHome(): Unit = {
    println("--- at Joe's home ---")

    implicit def homeNetWork: Wifi = new Wifi("home-network")

    connectToNetwork("guest")(homeNetWork)
    connectToNetwork("Joe Hacker")
  }

  atOffice()
  atJoesHome()
}
