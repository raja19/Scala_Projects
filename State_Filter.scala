import scala.io._
import java.io.PrintWriter
	
object State_Filter
{
def main(args:Array[String])
{
   if(args.length<2)
   {
    println("ERROR=> Please pass two Arguments while executing this Code")
   }
   else
   {
   try
	{
	
    /* 
	   args(0) => File Location Path which file you need to read_file	
	   args(1) => Search Filter value. The same has been created as new file in target machine
	   args(2) => Column position number from the file which column you needs to check
	*/
	
	val read_file = Source.fromFile(args(0))
	val get_lines = read_file.getLines
	val filter_by_name = get_lines.filter(a=>(a.split(",")(args(2).toInt)==args(1)))
	val write_to_file = new PrintWriter("D:/Big_Data/Scala_Projects/Real_Time/Dataset/output/"+args(1)+".txt")
	filter_by_name.foreach(single_line => write_to_file.println(single_line))
	write_to_file.close
	read_file.close
	}
   catch
	{   
	 case ex:Exception => println("Following Error Raised -->" + ex)
	}
  }

}
}
