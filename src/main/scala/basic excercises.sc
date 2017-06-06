
// Basic
val hello = "hello world"
println("Hello World")

println(hello)

//Assignment
def output1 (stringToOuput : Any) : Unit = {
  println(stringToOuput)
   }

output1 ("Hello World")

// Parameters
def output2 () : Any = {

  "Hello World"
}
// Type Interface
println(output2 () )

output1("hi")

// Strings
def output3 (var1 : String, var2 : Int) : String = {
  var1.substring( var1.length - var2, var1.length)
}

output3 ("Hello",3)

// Strings 2
def output4 (var1 : String, var2 : String, var3 : Char, var4 : Char ) : String = {
  var1.concat(var2) replace(var3, var4)
}
output4("Ha","llo",'a','e')

// Operators
def output5 (var1: Int = 2, var2: Int = 4) : Int = {
    var1 + var2
 }

output5 ()

//Conditionals
def output6 (var1: Int = 2, var2: Int = 4, var3: Boolean = false) : Int = {
  if (var3 == true){
    var1 + var2 }
    else var1 * var2
  }

output6 ()

//Conditionals 2
def output7 (var1: Int = 2, var2: Int = 0) : Int = {
  if (var2 == 0 )
    return 0
    else (var2)
    return 2
}

output7 ()

// Iteration
def output8 (var1: String = "hi", var2: Int = 3)= {
  for (var3 <- 1 to var2 ) {
    println(var1)
  }
}
output8 ()

// Iteration2
def output9 (var1: String = "h", var2: Int = 4)= {
  for (var3 <- 1 to var2 ) {
    println(var1)
  }
}
output9 ()
