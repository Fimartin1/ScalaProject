/**
  * Created by Administrator on 13/06/2017.
  */
abstract class Vehicle {
  var model: String
  val tyres: Int
  val vehicleReg: Int
  def showModel { println("Mode: " + model) }
  def showVehicleReg{ println("Vehicle Registration: " + vehicleReg) }

}
