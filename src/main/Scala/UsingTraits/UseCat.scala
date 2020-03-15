package UsingTraits

object UseCat extends App {
  def useFriend(friend: Friend): Unit = friend.listen()

  val alf = new Cat("Alf")
  //val friend: Friend = alf  //编译错误

  //useFriend(alf)  //编译错误
}
