def letterCode (code: String) : Unit = {
  var string = ""
  code match {
    case ".-" => string += "a"
    case "-..." => string += "b"
    case "-.-." => string += "c"
    case "-.." => string += "d"
    case "." => string += "e"
    case "..-." => string += "f"
    case "--." => string += "g"
    case "...." => string += "h"
    case ".." => string += "i"
    case ".---" => string += "j"
    case "-.-" => string += "k"
    case ".-.." => string += "l"
    case "--" => string += "m"
    case "-." => string += "n"
    case "---" => string += "o"
    case ".--." => string += "p"
    case "--.-" => string += "q"
    case ".-." => string += "r"
    case "..." => string += "s"
    case "-" => string += "t"
    case "..-" => string += "u"
    case "...-" => string += "v"
    case ".--" => string += "w"
    case "-..-" => string += "x"
    case "-.--" => string += "y"
    case "--.." => string += "z"
    case _ => string += " "
  }
  print(string)
}

def splitter1 (code: String) : Unit = {
  code.split(" ").map(l => letterCode(l))
  print(" ")
}

def splitter2 (code: String) : Unit = {
  code.split(" /").map(l => splitter1(l))

}

splitter1 (".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.-- ")