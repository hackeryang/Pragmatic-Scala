package UsingTraits

class Human(val name: String) extends Friend {
  //def listen(): Unit = println(s"Your friend $name is listening")
}

class Man(override val name: String) extends Human(name)
class Woman(override val name: String) extends Human(name)
