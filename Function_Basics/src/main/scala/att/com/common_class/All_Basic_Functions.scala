package att.com.common_class

class All_Basic_Functions {
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

}
