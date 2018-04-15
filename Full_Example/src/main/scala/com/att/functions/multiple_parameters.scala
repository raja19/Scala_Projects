package com.att.functions

class multiple_parameters {

  def display(name:String,address:String*): Unit =
  {
    println(s"Hi $name ---> $address")
  }

}
