package com.att.functions

class nested_function {

  def multiply(a:Int,b:Int,c:Int):Int={
  def multi2(x:Int,y:Int):Int=
  {
    (x*x)*y
  }
    multi2(a,multi2(b,c))
  }

}
