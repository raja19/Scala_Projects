package att.com.common_class

class Pattern_Matching_Ex {
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
