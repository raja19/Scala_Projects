package common_object
import att.com.common_class._

object Function_Basics {

  def main(args:Array[String])
  {
    val func_var = new All_Basic_Functions
    val pattern_var = new Pattern_Matching_Ex
    println("Call First Class Function")
    println("--------------------------")
    println("Difference Between Two Numbers: " + func_var.firstclass_fn(78,90)+"\n")
    println("Call Higher Order Function")
    println("--------------------------")
    println("Based on user inputs it will call anyone of above function: " + func_var.higherorder_fn(args(0).toInt,args(1).toInt)+"\n")
    println("Call Recursion Function")
    println("--------------------------")
    println("Factorial Number for 1st User Input Value => " + func_var.recursive_fn(args(0).toInt)+"\n")
    println("Call Tail_Recursion Function")
    println("--------------------------")
    println("Factorial Number for 10 is => " + func_var.tailrecursive_fn(10,1)+"\n")
    println("Call Anonymous Function")
    println("--------------------------")
    println("Adding two Numbers using simple syntax => " + func_var.add_numbers(67,89) +"\n")
    println("Call Anonymous Function")
    println("--------------------------")
    var outside_val = 90
    val closure_fn = (inside_val: Int) => inside_val + outside_val
    println(s"Adding Outside Closure values $outside_val => "+closure_fn(120))
    outside_val = 9999
    println(s"Adding Outside Closure values $outside_val => "+closure_fn(120))
    println("Call Pattern Matching")
    println("--------------------------")
    pattern_var.pattern_matching(List("RAJA",1212,32))
    pattern_var.pattern_matching("RAJA")
  }

}
