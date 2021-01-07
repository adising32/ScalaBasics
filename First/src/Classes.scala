

class A(var x : Int, val y : Int, private var z : Int, p : String){
  
  def printZ() : Unit ={
    println(z+""+p)}
  
  def this(x : Int, y : Int){
    this(x, y,10, "Auxilary")
  }
}

object Classes {
  def main(args : Array[String]) : Unit = {
    var obj : A = new A(22,33,44,"No getter/setter")
    println(obj.x)
    println(obj.y)
    obj.x = 54
    println(obj.x)
    obj.printZ()
    //not possible
//    obj.p
  }
}