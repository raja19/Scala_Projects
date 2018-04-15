
object untitled
{
  def main(args: Array[String]): Unit = {
    println("PODA")
    def add(i:Int):Int =
    {
      i*i
    }
    def a(id:Int): Unit =
    {
      var b = 1
      while (b<=id)
        {
          println(add(b))
          b = b+1
        }

    }
    a(4)
    type user_info = (String,Int,Double)
    def emp_detail(detail:user_info): Unit =
    {
      println(s"User Name ->" +detail._1+"\nAGE ->"+detail._2)
    }
    emp_detail("HELLO",21,43.3)

    case class emp_info(ename:String,elocation:String,age:Int,salary:Double)
    case class dep_info(did:Int,dname:String,dtype:String)
    val mm = emp_info("Ramesh","Chennai",27,38750)
    val nn = emp_info("Ramesh","Chennai",27,38750)
    val ss = dep_info(1,"Manual_Testing","Testing")
    val tt = dep_info(2,"Automation_Testing","Testing")
    val uu = dep_info(3,".NET","Development")

    println(uu.did+tt.did+uu.dname+ss.did)
    println(nn)
    if(mm equals nn)
      println("EQUAL DA")
    else
      println("DIfferent da")
    println(mm.age)
    def matchthis(u:Any,n:Int):Unit = u match
      {
      case emp_info(ename,elocation,age,salary) => println(s"Name -> $ename, Age -> $age, Location -> $elocation")
      case dep_info(did,dname,dtype) => println(s"Dname -> $dname, ID-> $did")
      case 0 => println("Entered zero da")
      case n:Int => println("Integer da")
      case "RAJA" => println("NAME DA")
      case _ => println("Anything DA")
    }
    matchthis(emp_info(elocation="KUMAR",ename="SALEM",age=23,salary=4536),34)

  }
}