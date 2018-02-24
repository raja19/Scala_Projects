//import com.sun.crypto.provider.AESCipher.AES128_CBC_NoPadding

object partially_applied_function {
  def main(args: Array[String]): Unit = {
    val email_creation = (username:String,id:String) => username+id
    val enter_email_values = email_creation(_:String,"@gmail.com")
    println("Enter Your Name..")
    val user_input = readLine()
    println("Your Generated Email Address ->"+enter_email_values(user_input))

    def salary(amount:Int)(days:Int):Int =
    {
     amount*days
    }

    println("Salary Amount with hard coded values => "+salary(12)(45))

    val sal1 = salary(211)_
    print("Enter No of Working Days->")
    val workingdays = readInt()
    val sal2 = sal1(workingdays)
    println("Find salary based on user inputs => "+sal2)

  }

}
