abstract class Person  {
  var firstName: String
  var lastName: String
  def show { println ("Name: " + firstName)}
  def showPerson { println ("Last Name: " + lastName)}
  override def toString = s""
}

class Employee (empnumb: Int, firstname: String, lastname: String) extends Person {
  var employeeNumber: Int
  var employeeFirstName: String
  var employeeLastName: String
  def showEmployee { println ("Employee Name...")}
  override def toString = s""
}

class Customer (customernumb: Int, firstname: String, lastname: String) extends Person {
  var customerNumber: Int
  var customerFirstName: String
  var customerLastName: String
  def showCustomer { println("Customer Name...")
  def toString = s""
  }

  abstract class Vehicle {
    var model: String
    val tyres: Int
    def spot: Int
    def showModel { println("Mode: " + model) }
    def showModel { println("Number of tyres: " + tyres) }
    override def toString = s""
  }

  class Truck(mod: String, tyr: Int) extends Vehicle {
    var model: String = mod
    val tyres: Int = tyr
    def spot { println("New Truck...") }
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