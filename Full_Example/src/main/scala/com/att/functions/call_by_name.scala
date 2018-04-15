package com.att.functions

class call_by_name {

  def account(balance: => Int): Unit =
  {
    println(s"1st day balance = $balance")
    println(s"2nd day balance = $balance")
    println(s"3rd day balance = $balance")
    println(s"4th day balance = $balance")
  }

}
