def blackjack (a: Int, b: Int) : Int = a match {

  case _ if a > 21 => 0
  case _ if b > 21 => 0
  case _ if a > b => a
  case _ if b > a => b
  case _ => 0

}
blackjack (22,22)
