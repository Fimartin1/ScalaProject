import java.util.TimeZone

def functions TimeZone.getAvailableIDs

def blackjack (var1: Int, var2: Int) : Int = var1 match {
  case _ if var1 == 21 => (println(var1))
  case _ if var2 == 0 => println(var2)
  case _ => 0
}

blackjack (18,21)