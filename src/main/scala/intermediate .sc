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

/*
def blackjack (var1: Int, var2: Int) : Int = var1 match {
  case _ if var1 == 21 => (println(var1))
  case _ if var2 == 0 => println(var2)
  case _ => 0
}

blackjack (18,21)
*/

// Too hot?
def summer (temperature: Int, isSummer: Boolean) : Any = temperature match {

  case _ if temperature == (60 > 100) | isSummer == true => true
  case _ if temperature == (60 > 100) | isSummer == false => false
  case _ if temperature == (60 > 90) | isSummer == true  => true
  case _ if temperature == (60 > 90) | isSummer == false  => false



}
summer (50, true)



