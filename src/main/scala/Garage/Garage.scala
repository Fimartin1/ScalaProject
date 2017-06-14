
/**
  * Created by Administrator on 12/06/2017.
  */
class Garage {

  val employees: String
  var open: Boolean = true


  def openGarage(): Unit = {

    open = true
  }

  def closeGarage(): Unit = {

    open = false
      }


  def addVehicles (vehicle: Vehicle): Unit = {
    vehicle =+ ( vehicle.registration -> vehicle )
  }

  }

  def removeVehicles: Unit = {

  }

  def registeringEmployees (employee: Employee) : Unit = {
    employees += (employee.id -> employee)

  }

  def calculatingBills: Unit = {

  }

  def garageContent: Unit = {

  }

