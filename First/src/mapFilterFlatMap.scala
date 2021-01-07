

object mapFilterFlatMap {
  
  def main(args : Array[String]) : Unit ={
   val lis = List(2,3,4,5,5)
   println(lis.map(x => x*x))
   println(lis.map(x => List(x,x+2)))
   println(lis.map(x => List(x,x+2)).flatten)
   println(lis.flatMap(x => List(x,x+2)))
   println(lis.filter(x => x%2==0))
    
   
   //reduce and fold
   println(lis.reduce((x,y) => x+y))
   println(lis.reduceLeft((x,y) => x-y))
   println(lis.reduceRight((x,y) => x-y))
   
   println(lis.foldLeft(1000)((x,y) => x+y))
  }
}