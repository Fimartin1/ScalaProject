val hello = "hello world"
println("Hello World")

println(hello)

def output1 (stringToOuput : Any) : Unit = {
  println(stringToOuput)
   }

output1 ("Hello World")

def output2 () : Any = {

  "Hello World"
}

println(output2 () )

output1("hi")

def output3 (var1 : String, var2 : Int) : String = {
  var1.substring( var1.length - var2, var1.length)
}

output3 ("Hello",3)

def output4 (var1 : String, var2 : String, var3 : Char, var4 : Char ) : String = {
  var1.concat(var2) replace(var3, var4)
}
output4("Ha","llo",'a','e')

def output5 (var1: Int = 2, var2: Int = 4, var3: Boolean = false) : Int = {
  if (var3 == true){
    var1 + var2 }
    else var1 * var2
  }

output5 ()

