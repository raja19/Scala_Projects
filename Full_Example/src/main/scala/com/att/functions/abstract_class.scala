package com.att.functions

abstract class per_info {

  def info(name:String): Unit =
  {
    println(s"Name was-->$name")
  }

  def address(){}
}



class abstract_class extends per_info
{
  def address(place:String): Unit =
  {
    println("Your place is -->"+place)
  }

  override def info(n1:String="Initial Value"): Unit = {println(("Modified name-->"+n1))}
}