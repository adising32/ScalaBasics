package com.coding

object PreparingOlymp {
  def main (args : Array[String]) : Unit = {
    
    //get the input as string
    val input = scala.io.StdIn.readLine().split("\\s+");
//    println
    val input2 = scala.io.StdIn.readLine().split("\\s+");
    
    //convert to int array
    var data = input.map(x => x.toInt)
    var data2 = input2.map(x => x.toInt)
    
    //initalize the values
    val n = data(0)
    val l = data(1)
    val r = data(2)
    val x = data(3)
    
    var count=0
    for(i<-0 to n-1){
      var sum = data2(i)
      var max = data2(i)
      var min = data2(i)
      for(j<-i to n-1; if i!=j){
        sum += data2(j)
        max = max.max(data2(j))
        min = min.min(data2(j))
        if(sum>=l && sum<=r && (max-min)>=x){
          println(sum+","+max+","+min)
          count+=1
        }
      }
    }
    println("count is :"+count)
    
  }
      
    
}