package att.com.common_objects
import att.com.common_classes._

object call_by_reference {
  def main(args: Array[String]): Unit = {
  val CR = new call_by_example
  var starting_amount = 1400
  var default_deposit_amount_every_day = 300
  CR.call_by_val
  {
     starting_amount+=default_deposit_amount_every_day;
     starting_amount
  }
  println("---------****************------------------")
  starting_amount = 1400
  CR.call_by_ref
    {
       starting_amount+=default_deposit_amount_every_day;
       starting_amount
    }
}}
