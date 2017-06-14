
abstract class Person (firstName: String, lastName: String)  {


  override def toString = s"Customer first name is $firstName" + s"$lastName"
 }

class Employee (empnumb: Int, firstname: String, lastname: String) {
  override def toString = s""
}

class Customer (customernumb: Int, firstname: String, lastname: String) {
  override def toString = s""
  }

abstract class Vehicle (model: String, tyres: Int) {
   override def toString = s""
  }

class Truck(mod: String, tyres: Int) extends Vehicle {
      override def toString = s""
  }

  class Bike(mod: String, tyr: Int) extends Vehicle {
    var model: String = mod
    val tyres: Int = tyr
    def spot { println("New Bike...") }
    override def toString = s""
  }

  class Car(mod: String, tyr: Int) extends Vehicle {
    var model: String = mod
    val tyres: Int = tyr
    def spot { println("New Car...")}
    override def toString = s""
  }

}