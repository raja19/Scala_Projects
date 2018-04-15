package com.att.functions

class PatternMatch_class {

  def find_type(a: Any, b: Int): Unit = {
    var c = 12
    a match {
      case 1 => {
        if(b>0){
        c += 32;
        println(c)}
        else
          {
            c -= 8;println(c)
          }
      }
      case m: String => println("It was String")
      case _ => println("No value matches")
    }

  }
}
