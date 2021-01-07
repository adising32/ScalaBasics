package Inheritence

class Rectange(val x : Double, val y : Double) extends Polygon{
  override def area() : Unit ={
    println(x*y)
  }
}