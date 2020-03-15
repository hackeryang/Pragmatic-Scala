package FromJavaToScala

class Protected {
  class Vehicle {
    protected def checkEngine() {}
  }

  class Car extends Vehicle {
    def start() { checkEngine() }
    def tow(car: Car): Unit = {
      car.checkEngine()
    }
    def tow(vehicle: Vehicle): Unit = {
      //vehicle.checkEngine()  //编译错误
    }
  }

  class GasStation {
    def fillGas(vehicle: Vehicle): Unit = {
      //vehicle.checkEngine()  //编译错误
    }
  }
}
