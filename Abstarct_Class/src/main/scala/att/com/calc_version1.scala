package att.com
/*
Abstract Class:
  We can extend abstract class properties to any new class. Here we can declare and implement the function.
  In scala Abstract and Traits behaves mostly similar except one main difference,
    Able to extends more than one traits to one class like,
      class c1 extends t1 with t2 with t3
    But we can't extends more than one abstract class to another class
*/
abstract class calc_version1 {
  def add
  def mul(a:Int,b:Int):Int={
  a+b
  }
}

