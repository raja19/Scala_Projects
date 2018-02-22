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

object trait_ex
{
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
}
}
