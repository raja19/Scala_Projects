package att.com

abstract class calc_version2 {

  def multi(a:Int,b:Int): Int =
  {
    def mod(c:Int,d:Int):Int =
    {
      (c*c)*d
    }
    def mod3(d:Int):Int=
    {
      d*d*d
    }
    mod(a,mod3(b))
  }
}
