////// Task 1
////// I would need to use a method where I can double each Char input and print it out
////
//
////def repeatChar(c: String, n: Int): Any =
////  for c <- ""
//
//def repeatChar(a: String, b: Int) =
//for (c <- a) println (c.toString*b)
//
//repeatChar("The", 2)

// Task 2
//  I would need to use the split method and pattern matching. I would need to remove any code that doesn't
// have the word 'Jam' in it - then print the result. If the input doesn't have jam
//// then return an empty string

def getSandwhich(a: String)  =
    getSandwhich.split("bread")

 if (a == "b") => "b" } {
case _ if a == "r" => "e"
  _ = "nothing"
}

getSandwhich("breadjam")


//
//// Task 3
//// I would need to work out if the value of a, b and c is evenly spaced, if they are return true
////else return false
//
//////Task 4
////
////
//////Task 6
//////I would need to create a method where I would split the string based on the input from the user
////// for example, if the user inputs ("Hello", 2) I would return only the first two
////// chars and the last two chars e.g'He' and the 'lo' print out - 'Helo'
//
//def nTwice (a: String, b: Int) : Any =  {
//    a.take(b) + a.takeRight(b)
//
//}
//nTwice ("Hello", 2)
//nTwice ("Chocolate", 3)
//nTwice ("Chocolate", 1)
//
//////Task 7
////// Would need to use .contains and pattern matching, if the input ends in 'ly' then return the 'ly' else
////// return false
////
////def endsLy (a: String) : Any = a match {
////  case _ if (a == ("ly")) => true
////  case _ => false
////
////}
////endsLy("oddy".takeRight(2))
////endsLy("oddy".takeRight(2))
////endsLy("oddy".takeRight(2))

//str(str.length-1)+str(str.length-1)
//
//
////Task 8
//// Would need to remove any duplicated chars and print out only single chars. Maybe using the
////'Set' method?

def stringClean (a: String) = {

}
stringClean("yyzzza")
//
//// Task 9
//
//def sumInt(a: Int, b: Int ) = sum( x => x, a, b)