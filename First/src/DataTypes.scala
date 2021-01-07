

object DataTypes {
  
  def main(args : Array[String]) : Unit ={
		//String
    var x : String = "ss"
		println(x)
				  
		//Array
		var arr : Array[Int] = new Array[Int](4)
		arr(0) = 30
		arr(1) = 40
		for(i <- arr){
		  println(i)
		}
		
    List
		var l : List[Int] = List(1,2,3,4)
		println(l.head)
		println(l.tail)
		l = 2 :: l
		l.foreach(print)
		l = 2 :: 3 :: Nil
		println()
		l.foreach(print)
		
		//Set
		val s : Set[Int] = Set(1,2,3,3)
		var sm = scala.collection.mutable.Set(4,4,5,5,6,6)
		
		//s = s + 10 
		sm = sm + 10
		println(s)
		println(sm)
		println(s(6))
		println(s ++ sm)
		println(s & sm)
		
		//Maps
		var map : Map[Int, String] = Map(801->"x", 802->"y", 803->"z")
		map.keys.foreach{key => 
		  print(key)
		  println(map(key))
		  }
    
    //Tuples
    val tup : Tuple2[Int,String] = new Tuple2(1,"xx")
    println(tup._1)
    tup.productIterator.foreach(println)
  }

}












