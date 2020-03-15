package Intermixing

class Ostrich extends Bird {
  override def fly(): Unit = {
    throw new NoFlyException
  }
  //...
}
