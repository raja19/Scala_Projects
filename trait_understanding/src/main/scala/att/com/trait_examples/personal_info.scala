package att.com.trait_examples

trait personal_info
{
  val dept_ty = "Bench"
  def add_employee(){}
  def assign_dept():Unit=
  {
    println(s"You are Assigned to $dept_ty Code")
  }
}

trait salary_info
{
  val variable_pay_percent = 10
  def sal_structure(annual_pay:Int):Int =
  {
    return (annual_pay/100)*variable_pay_percent
  }
}

trait welcome_message
{
  def welcome_info():Unit=
  {
    println("Welcome to our Company. All the best -:)")
  }
}