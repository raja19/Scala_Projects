package common_codes.main_object
import common_codes.cognizant
import common_codes.infosys

object trait_understanding{
  def main(args:Array[String])
{
  try
{
  val infy = new infosys
  val cts = new cognizant
  println("Start Displaying Values from INFOSYS")
  infy.add_employee("Ramesh","Chennai",45,"M")
  infy.assign_dept()
  println("Your Variable Pay Amount From Your Annual Pacakage is => "+ infy.sal_structure(95000))
  infy.welcome_info()
  println("--------------------------***------------------------")
  println("Fill Basic Form for CTS")
  println("Enter Your Name: ")
  val name = readLine()
  println("Total Years Of Experience: ")
  val exp = readInt()
  println("Higher Education Qulaification: ")
  val qual = readLine()
  println("Expected Salary: ")
  val sal = readInt()
  cts.add_employee(name,qual,exp)
  println(s"You will get 17 percentage amount as Variable pay in the year end from $sal, That Amount is ->"+cts.sal_structure(sal))
  cts.assign_dept()
  cts.welcome_info()
  println("--------------------------***------------------------")
}
  catch
{
  case ioe: Exception => println("Sorry..You have entered wrong value in the form fields..Please Try Again")
}
}}
