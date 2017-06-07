def letterCode (code: String) : Unit = {
  var string = ""
  code match {
    case "a" => string += ".- "
    case "b" => string += "-... "
    case "c" => string += "-.-. "
    case "d" => string += "-.. "
    case "e" => string += ". "
    case "f" => string += "..-. "
    case "g" => string += "--. "
    case "h" => string += ".... "
    case "i" => string += ".. "
    case "j" => string += ".--- "
    case "k" => string += "-.- "
    case "l" => string += ".-.. "
    case "m" => string += "-- "
    case "n" => string += "-. "
    case "o" => string += "--- "
    case "p" => string += ".--. "
    case "q" => string += "--.- "
    case "r" => string += ".-. "
    case "s" => string += "... "
    case "t" => string += "- "
    case "u" => string += "..- "
    case "v" => string += "...- "
    case "w" => string += ".-- "
    case "x" => string += "-..- "
    case "y" => string += "-.-- "
    case "z" => string += "--.. "
    case _ => string += "/"
  }
  print(string)
}

def splitter1 (code: String) : Unit = {
  code.split("").map(l => letterCode(l))

}

def splitter2 (code: String) : Unit = {
  code.split(" ").map(l => splitter1(l))

}

splitter1 ("hello daily programmer good luck on the challenges today")