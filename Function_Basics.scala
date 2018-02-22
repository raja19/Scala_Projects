class All_Basic_Functions
{
	/* Function 1: First Class Function
			It was the default function. 
			We can return the value also pass the function as parameter to another any functions
	*/
	def firstclass_fn(a:Int,b:Int):Int=
	{
		if(a>b)
			return a - b
		else
			return b - a
	}
	/* Function 2: Higher Order Function
			which is a function that takes another function as its parameter or returns a another function.
	*/
	def higherorder_fn(c:Int,d:Int):Int=
	{
		if(c==d)
			return c * d
		else	
			firstclass_fn(c,d)
	}
	/* Function 3: Recursion Function
			A recursive function is a function which calls itself.
			But if the number of recursive calls exceeds the limit of the stack, the StackOverflow error occur.
	*/
	def recursive_fn(e:Int):Int=
	{
		if(e<=1)
			return e
		else
			return e*recursive_fn(e-1) //It will works for input 5 => 5*val(5-1)*val(4-1)*val(3-1)*val(2-1)*1=> 5*4*3*2*1
	}
	/* Function 4: Recursion Function
			Tail recursion is a special kind of recursion where the recursive call is the very last thing in the function. 
			This is important because it means that you can just pass the result of the recursive call through directly 
			instead of waiting for it—you don't have to consume any stack space.
	*/
	def tailrecursive_fn(e:Int,f:Int):Int=
	{
		if(e<=f)
			return f
		else
			return recursive_fn(e-1)*f
	}
	
	/* Function 5: Anonymous Function
			provides a relatively lightweight syntax for defining anonymous functions.
			This functions can be represented by objects, which are called function values.
			We will create this function using simple command
				def add_numbers(e:Int,f:Int):Int={return e+f}
	*/
		
	val add_numbers = (e:Int,f:Int)=>{e+f}
	
	/* Function 6: Closure Function
			A closure is a function, whose return value depends on the value of one or more variables declared outside this function.
			It will not pure functions because sometimes output will be differ for same input.
	*/
		
	/* Pattern Matching
			It works same as switch case in other programming languages. It matches best case available in the pattern.
	*/
	
	def pattern_matching(a:Any):Unit =
	{
		a match
		{
		case a:Int => println("It was Number")
		case a:String => println("it was String")
		case List(_,_) => println("List Contains two Arguments")
		case _ => println("Not Satisfied any one Pattern Matching conditions")
		}
	}
	
}


object Function_Basics
{
def main(args:Array[String])
{
	val class_var = new All_Basic_Functions
	println("Call First Class Function")
	println("--------------------------")
	println("Difference Between Two Numbers: " + class_var.firstclass_fn(78,90)+"\n")
	println("Call Higher Order Function")
	println("--------------------------")
	println("Based on user inputs it will call anyone of above function: " + class_var.higherorder_fn(args(0).toInt,args(1).toInt)+"\n")
	println("Call Recursion Function")
	println("--------------------------")
	println("Factorial Number for 1st User Input Value => " + class_var.recursive_fn(args(0).toInt)+"\n")
	println("Call Tail_Recursion Function")
	println("--------------------------")
	println("Factorial Number for 10 is => " + class_var.tailrecursive_fn(10,1)+"\n")
	println("Call Anonymous Function")
	println("--------------------------")
	println("Adding two Numbers using simple syntax => " + class_var.add_numbers(67,89) +"\n")
	println("Call Anonymous Function")
	println("--------------------------")
	var outside_val = 90
	val closure_fn = (inside_val: Int) => inside_val + outside_val
	println(s"Adding Outside Closure values $outside_val => "+closure_fn(120))
	outside_val = 9999
	println(s"Adding Outside Closure values $outside_val => "+closure_fn(120))
	println("Call Pattern Matching")
	println("--------------------------")
	class_var.pattern_matching(List("RAJA",1212,32))
	class_var.pattern_matching("RAJA")
	
	
}
}
