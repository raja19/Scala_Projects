package att.com.common_classes

class call_by_example {

  def call_by_val(i:Int): Unit =
  {
    println("Starting Day closing Amount->"+i)
    println("2nd Day closing Amount->"+i)
    println("3rd Day closing Amount->"+i)
    println("4th Day closing Amount->"+i)
    println("5th Day closing Amount->"+i)
  }

  def call_by_ref(i: =>Int):Unit =
  {
    println("Starting Day closing Amount->"+i)
    println("2nd Day closing Amount->"+i)
    println("3rd Day closing Amount->"+i)
    println("4th Day closing Amount->"+i)
    println("5th Day closing Amount->"+i)
  }


}
