package Garage

/**
  * Created by Administrator on 13/06/2017.
  */

abstract class Parts {

  val cost: Double
  val broken: Boolean
  val labourHours: Double
}

private class Battery extends Parts {
  override val cost: Double = 75.99
  override val broken: Boolean = true
  override val labourHours: Double =  0.5
  override def toString = s" New Battery needed ($id $cost $labourHours "
}

private class Engine extends Parts {
  override val cost: Double = 1050.00
  override val broken: Boolean = true
  override val labourHours: Double =  0.5
}

private class Gearbox extends Parts {
  override val cost: Double = 265.00
  override val broken: Boolean = true
  override val labourHours: Double =  0.5
}

private class OilCap extends Parts {
  override val cost: Double = 6.00
  override val broken: Boolean = true
  override val labourHours: Double =  0.15
}

private class WindScreenWipers extends Parts {
  override val cost: Double = 25.00
  override val broken: Boolean = true
  override val labourHours: Double =  0.25
}

private class LighBulb extends Parts {
  override val cost: Double = 5.00
  override val broken: Boolean = true
  override val labourHours: Double =  0.5
}

private class BreakPads extends Parts {
  override val cost: Double = 375.00
  override val broken: Boolean = true
  override val labourHours: Double =  2.5
}

private class Tyre extends Parts {
  override val cost: Double = 45.00
  override val broken: Boolean = true
  override val labourHours: Double =  1.0
}

private class Windscreen extends Parts {
  override val cost: Double = 450.00
  override val broken: Boolean = true
  override val labourHours: Double =  1.5
}

private class Exhaust extends Parts {
  override val cost: Double = 425.00
  override val broken: Boolean = true
  override val labourHours: Double =  2.5
}
