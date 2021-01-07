

object Closures {
  val number = 10
  
  def clos(x : Int) : Int ={return x+number}
  
  def main(args : Array[String]) : Unit ={
    println(clos(10))  
  }
}