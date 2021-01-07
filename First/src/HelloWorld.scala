
/*
 * Singleton class HelloWorld */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
//    x()
    y()
  }
  
  def x(): Unit = {
    println("ss")
    val x : Int = 12
    println(s"$x")
    println(f"$x%d")
    println(raw"$x\n")
  }
  
  def y(): Unit ={
    for(i <- 1 to 5){
      println(i)
    }
    
    for(i<-1 to 3; j <- 1 to 4){
      println(i+" "+j)
    }
    
    val lst = List(1,5,7,8)    
    for(i <- lst){
      print(i+",")
    }
    
    for(i<-lst;if i<3){
      print(i+",")
    }
    
    var x = for{i<-lst;if i<3} yield {i*i}
    println(x.toString())
    
   
  }
}










