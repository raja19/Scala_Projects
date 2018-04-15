package com.att.maincode
import com.att.functions._
object Full_Example {

  def main(args:Array[String]): Unit =
  {
    try {
      val trait_obj = new use_trait
      val nested_obj = new nested_function
      val abstract_obj = new abstract_class
      val named_obj = new Named_Function
      val partial_obj = new partially_applied
      val mulitple_obj = new multiple_parameters
      val call_by_obj = new call_by_name
      val loop_obj = new loops_class
      val pattern_obj = new PatternMatch_class

      trait_obj.sub(12)
      println("Enter one Number")
      val n1 = readInt()
      println("ADDition-->" + trait_obj.add(21, n1))
      //trait_obj.mul(n1,32)
      println("MUL-->" + trait_obj.mul(n1, n1))

      val k = (a: Int) => {
        a * a * a
      }
      print(k(10))

      println("nested val-->" + nested_obj.multiply(2, 3, 4))

      abstract_obj.info()

      named_obj.employee(eage = 56, ename = "Guna", esal = 3232.32)

      val salary1 = partial_obj.sal_diff(_: Int, 14)
      val salary2 = salary1(10)
      println("SALARY val..." + salary2)

      val fname = partial_obj.closure_fun("Ramesh Raja")(_)
      val email = fname("@gmail.com")
      email

      mulitple_obj.display("Ramesh", "First", "workinG")

      var starting_balance = 5
      call_by_obj.account({
        starting_balance -= 1;
        starting_balance
      })
      println(starting_balance)


      val greater = loop_obj.if_loop(b = 56, a = 56, c = 6)
      println(greater)

      pattern_obj.find_type(1, -23)

      val numbers_list = Range(10, 50, 5)
      numbers_list.map(x => x + 1).foreach(println)

      val place = "hello world welcome"
      place.split(" ").withFilter(x => x.endsWith("w")).foreach(println)

      val assign_val = for (i <- 1 to 10) yield {
        if (i > 7) {
          "Value is--->" + i
        }
      }
      println(assign_val)

      //val error_handling = n1/0

    }
    catch
      {
        case error:NumberFormatException => println("Divided by o-->"+error)
        case _ => println("ERRor Happened")
      }
  }
}
