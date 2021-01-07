

object MatchExpressions {
  def main(args: Array[String]): Unit = {
    val age = 40
    
    age match{
      case 10 => println(age)
      case 20 => println(age)
      case _ => println("default")
    }
    
    var x = age match{
      case 10 => 10
      case 20 => 20
      case 30|40|50 => "high"
      case _ => "default"
    }
    println(x)
  }
}