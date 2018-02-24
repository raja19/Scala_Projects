package capacityplanning
import att.com._
object Absarct_Class {
  def main(args: Array[String]): Unit = {
    val c1 = new calc_main
    val c2 = new calc_main1
    c1.add()
    println("Multipication of two numbers"+c1.mul(12,43))
    println("23 ODD OR EVEN ")
    c2.oddOReven(12)
   println("Multiply =>"+c2.multi(6,3))
      }

}
