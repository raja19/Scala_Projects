package com.att.functions

class partially_applied {

  def sal_diff(s1:Int,s2:Int):Int=
  {
    s1*(s2-10)
  }

  def closure_fun(name:String)(email:String): Unit =
  {
    println(s"Your final ID is-> $name$email")
  }
}
