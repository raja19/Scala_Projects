package com.att.functions

class loops_class {
def if_loop(a:Int,b:Int,c:Int)=
  {
    var start_val = 0
    var end_val = 10
    if(a>b)
      "A GREATER"
    else if(c>0) {
      while (end_val > 0) {
        start_val+=2;
        end_val-=3;}
       start_val
    }
    else
      "B Greater"
  }
}
