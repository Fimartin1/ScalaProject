/*def blackjack (a: Int, b: Int) : Int = a match {

  case _ if a > 21 => 0
  case _ if b > 21 => 0
  case _ if a > b => a
  case _ if b > a => b
  case _ => 0

}
blackjack (22,22) */

// Unique Sum
/*def uniqueSum (a: Int, b: Int, c: Int) : Int = a match {
  case _ if a == 1 => a + b + c
  case _ if a == b => 0
  case _ if a == c => 0
  case _ if 1 == 1 => 0
  case _ => 0
}
uniqueSum (1,1,2)
*/

// Too hot?
def summer (temperature: Int, isSummer: Boolean) : Any = temperature match {

  case _ if temperature == (60 > 90) | isSummer == true => true

    case _ if isSummer == true  => temperature



}
summer (80, true)



