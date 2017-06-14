

abstract class Person  {
  var firstName: String
  var lastName: String
  val id: String
  def show { println ("Name: " + firstName)}
  def showPerson { println ("Last Name: " + lastName)}
}

class Employee (var firstName: String, var lastName: String, val id: String = "") extends Person {
  //val employeeNumber: Int = empNumb
  def showEmployee { println ("Employee Name...")}
  override def toString = s" Employee (Employee Number: $id $firstName $lastName "
}

class Customer (var firstName: String, var lastName: String, val id: String = "", var carReg: Int) extends Person {
  def showCustomer { println("Customer Name...") }
  override def toString = s" Customer (Customer Number: $id $firstName $lastName "
  }

  abstract class Vehicle {
    var model: String
    val tyres: Int
    val vehicleReg: Int
    def showModel { println("Mode: " + model) }
    def showVehicleReg{ println("Vehicle Registration: " + vehicleReg) }

  }

  class Truck(var model: String, val tyres: Int, val vehicleReg: Int) extends Vehicle {
    var working: Boolean = true
    def showTruck { println("New Truck...") }
    override def toString = s"Truck (Truck Vehicle Registration: $vehicleReg"
  }

  class Bike (var model: String, val tyres: Int, val vehicleReg: Int) extends Vehicle {
    var working: Boolean = true
    def newBike { println("New Bike...") }
    override def toString = s"Bike (Bike Vehicle Registration: $vehicleReg"
  }

  class Car (var model: String, val tyres: Int, val vehicleReg: Int)extends Vehicle {
    var working: Boolean = true
    def newCar{ println("New Bike...") }
    override def toString = s"Car (Car Vehicle Registration: $vehicleReg"
  }
