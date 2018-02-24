package common_codes
import att.com.trait_examples._

class cognizant extends personal_info with salary_info with welcome_message
{
  def add_employee(name:String,degree:String,exp_year:Int):Unit=
  {
    println(s"Hi $name, You have $exp_year years of experience with qualification of $degree.")
  }
  override val dept_ty = "CITI_BANK"
  override def assign_dept():Unit=
  {
    println(s"If your Selected you need to work with $dept_ty Customer.")
  }
  override val variable_pay_percent = 17


}
