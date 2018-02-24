package common_codes
import att.com.trait_examples._

class infosys extends personal_info with salary_info with welcome_message
{
  def add_employee(name:String,loca:String,age:Int,sex:String):Unit=
  {
    println(s"Hi $name, Your coming from $loca with age of $age and your Gender is $sex")
  }
  override def welcome_info():Unit=
  {
    println("Infosys welcomes you to the new World")
  }
}


