// Luka Khuzaurashvili
// Week 1 Assignment

object Week1 {
  def main(args: Array[String]): Unit = {
    Problem1(5, 7)
  }
  // Problem 1
  def Problem1 (x:Int, y: Int): Int = {
  var res = 0
    if (x == y) {
      res = 3*(x+y)
    }
    else {
      res = x+y
    }
    println("Problem 1 answer is " + res)
  return res
  }

//  // Problem 2
//  def Problem2 (text: String) : String = {
//    var length = text.length
//    if (length < 1) {
//      println("Missing Input String")
//      return "Missing Input String"
//    }
//    var char = text.charAt(length - 1)
//    var newText = char + text + char
//    println("New text: " + newText)
//    return newText
//  }
//
//  // Problem 3
//  def Problem3 (n: Int): Int = {
//    var ans = 0
//    if (n > 51) {
//      ans = 3 * (n - 51)
//    }
//    else {
//      ans = 51 - n
//    }
//    println("The result is " + ans)
//    return ans
//  }
//
//  // Problem 4
//  def Problem4 (x:Int, y:Int): Boolean = {
//    if (x == 30 || y == 30 || x+y == 30) {
//      println("True")
//      return true
//    }
//    else {
//      println("False")
//      return false
//    }
//  }
//
//  // Problem 5
//  def Problem5 (x:Int): Boolean = {
//    if ((x >= 80 && x<=120) || (x>=280 && x<=320)) {
//      println("True")
//      true
//    }
//    else {
//      println("False")
//      false
//    }
//  }
//
//  // Problem 6
//  def Problem6 (text:String): String= {
//    if (text.indexOf("if") == 0) {
//      println("Text is unchanged: " + text)
//      return text
//    }
//    else {
//      var NewText = "if" + text
//      println("Text has been altered: " + NewText)
//      return NewText
//    }
//  }
//
//  // Problem 7
//  def Problem7 (text: String, x:Int): String = {
//    val length = text.length
//    if (x < 0 || x > length - 1) {
//      println("index is out of range")
//      return "Index is out of range"
//    }
//    else {
//      var part1 = text.substring(0, x)
//      var part2 = text.substring(x + 1, length)
//      var NewText = part1 + part2
//      println("New Text: " + NewText)
//      return NewText
//    }
//  }
//
//  //Problem 8
//  def Problem8 (text:String): String = {
//    val length = text.length
//    val firstChar = text.charAt(0)
//    val lastChar = text.charAt(length - 1)
//    var NewText = lastChar + text.substring(1,length-1) + firstChar
//    println("New Text: " + NewText)
//    return NewText
//  }
}
