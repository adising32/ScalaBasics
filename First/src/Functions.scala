import java.util.Date

object Functions {
  def main(args: Array[String]): Unit ={
    println(add(2,3))
    println(Math square 2)
    println(Math.areaCircle(6))
    println(Math - (2,3))
    
    //anonymous function
    var x  = (x : Int, y: Int)=>x+y
    var y = x(2,3)
    var z = x.apply(2, 3)
    println(x)
    println(y+" "+z)
    
    //HOF
    var q = func(2,3,4, (x,y)=>x+y)
    
    //can also be written as
    var w = func(2,3,4, _ min _)
    println(q+" "+w)
    
    
    //partially applied function
    var log = (date : Date, message : String)=> {println(date+" : "+message)}
    var d = new Date
    var newlog = log(d,_:String)
    newlog("x")
    newlog("y")
    newlog("z")
  }
  
  def add(x : Int, y : Int) : Int ={
    return x+y
  }
  
  object Math {
	  def square(x : Int) : Int ={
			  return x*x
	  }
	  
	  def areaCircle(r : Int, pi : Float=3.14f) : Double ={
	    return pi * r * r
	  }
	  
	  def -(x : Int, y: Int) : Int ={
	    return x-y
	  }
  }
  
  //Higer order function -> takes a functions as input and returns a function
  def func (x: Int, y : Int, z : Int, f : (Int,Int) => Int) : Int = f(f(x,y),z)
}








