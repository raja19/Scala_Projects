package att.com

class calc_main extends calc_version1 {
 def add()
 {
  println("It was Empty Add Method")
 }
}

class calc_main1 extends calc_version2 {
  def oddOReven(a:Int)
  {
    if(a%2==0)
      println("It was Even Number")
    else
      println("It was Odd Number")
  }
}
