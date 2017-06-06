import scala.collection.Map

// Basic
//val hello = "hello world"
//println("Hello World")
//
//println(hello)

//Assignment
//def output1 (stringToOuput : Any) : Unit = {
//  println(stringToOuput)
//   }
//
//output1 ("Hello World")

// Parameters
//def output2 () : Any = {
//
//  "Hello World"
//}
// Type Interface
//println(output2 () )
//
//output1("hi")

// Strings
//def output3 (var1 : String, var2 : Int) : String = {
//  var1.substring( var1.length - var2, var1.length)
//}
//
//output3 ("Hello",3)

// Strings 2
//def output4 (var1 : String, var2 : String, var3 : Char, var4 : Char ) : String = {
//  var1.concat(var2) replace(var3, var4)
//}
//output4("Ha","llo",'a','e')

// Operators
//def output5 (var1: Int = 2, var2: Int = 4) : Int = {
//    var1 + var2
// }
//
//output5 ()

//Conditionals
//def output6 (var1: Int = 2, var2: Int = 4, var3: Boolean = false) : Int = {
//  if (var3 == true){
//    var1 + var2 }
//    else var1 * var2
//  }
//
//output6 ()

//Conditionals 2
//def output7 (var1: Int = 2, var2: Int = 0) : Int = {
//  if (var2 == 0 )
//    0
//    else (var2)
//    2
//}
//
//output7 ()

// Iteration
//def output8 (var1: String = "hi", var2: Int = 3) = {
//  for (var3 <- 1 to var2) {
//    println(var1)
//  }
//}
//output8 ()

// Iteration2
//def output9 (var1: String = "h", var2: Int = 4) = {
//  for (var3 <- 1 to var2) {
//    yield(var1 + var2)
//  }
//}
//output9 ()

// Iteration2
//def output10 (var1: String = "h", var2: Int = 4) = {
//  for (var3 <- 1 to var2) {
//  for(var4 <- 1 to var2) {
//    print(var1)
//  }
//    println()
//  }
//}
//output10 ()

// Iteration2 - second example
//def output11(var1:String = "h", var2: Int = 4)
//{
//  for(var3<-1 to var2)
//    {
//      println(var1*var2)
//    }
//}
//
//output11()

// Iteration3

/*def output12 (var1: String = "Fizz", var2: String = "Buzz", var3: Int = 15) = {
  for (var4 <- 1 to var2) {
    for(var5 <- 1 to var2) {
      print(var1)
    }
    println()
  }
}
output12 ()
*/

// Pattern Matching 1 - Conditionals 1
//def output13 (var1: Int = 2, var2: Int = 4) : Any = var1 match {
//  case var1 => println(var1)
//    2
//  case var2 => println(var2)
//    4
//}
//
//output13 (2, 4)

//Pattern Matching 1 - Conditionals 2

def output14 (var1: Int, var2: Int, var3:Boolean) : Any = var1 match {
  case _ if var1 == 0 => (println(var2))
  case _ if var2 == 0 => println(var1)
  case _ => 0
}

output14 (2,0, true)

//Pattern Matching 2

/*def swap (var1: Any) =
  var1 match {
    case List(x,s) => List(s,x)
    case (a,x) => (x, a)
    case Array(a, x) => Array (x, a)
    //case arayCase: Array[Int] => Array(arayCase(1), arayCase.head)
    case _ => println("Couldn't match")
  }
swap(Array(1,2)) */

// Pattern Matching swap2
def swap2 (var1: Any) =
  var1 match {
    case listCase: List[Int] => List(listCase(1), listCase.head)
    case (a,x) => (x, a)
    case Array(a, x) => Array (x, a)
    //case arrayCase: Array[Int] => Array(arrayCase(1), arrayCase.head)
    case _ => println("Couldn't match")
  }
swap2(List(1,2, 3))
