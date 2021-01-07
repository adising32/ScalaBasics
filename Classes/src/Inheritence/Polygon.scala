package Inheritence

class Polygon {
  def area() : Unit={
    println("0.00")
  }
}

object Polygon{
  def main(args : Array[String]) : Unit = {
    var p = new Polygon
    p.area()
    
    var r  = new Rectange(2.0,3.0)
    r.area
  }
}