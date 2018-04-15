package com.att.functions

trait trait_example {
  def add(){}
  def sub(){}
  def mul(a:Int,b:Int): Int =
  {
    a*b
  }

}
trait trait_example2 {
  def div(){}
}

class use_trait extends trait_example with trait_example2
{
  def add(a:Int,b:Int):Int={a+b}
  def sub(c:Int){println("WORKS")}
  def div(c:Int,d:Int):Int={c/d}

  override def mul(a:Int,b:Int):Int={a}



}
