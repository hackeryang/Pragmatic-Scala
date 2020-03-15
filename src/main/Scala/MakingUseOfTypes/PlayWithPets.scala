package MakingUseOfTypes

object PlayWithPets {

  class Pet(val name: String) {
    override def toString: String = name
  }

  class Dog(override val name: String) extends Pet(name)

  def workWithPets(pets: Array[Pet]): Unit = {}

  def playWithPets[T <: Pet](pets: Array[T]): Unit =
    println("Playing with pets: " + pets.mkString(", "))

  def copyPets[S, D >: S] (fromPets: Array[S], toPets: Array[D]): Unit = {}

  val dogs = Array(new Dog("Rover"), new Dog("Comet"))
  //workWithPets(dogs)  //编译错误
  playWithPets(dogs)
  val pets = new Array[Pet](10)
  copyPets(dogs, pets)
}
