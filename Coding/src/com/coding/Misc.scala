package com.coding

import scala.io.StdIn._
 
object Misc extends App{
  val Array(n, l, r, x) = readLine().split(" ").map(_.toInt)
  val C = readLine().split(" ").map(_.toInt).sorted
 
  var counter = 0
  for (i <- 0 until Math.pow(2.0, n).toInt) {
    if (isPossible(i)) counter += 1
  }
  println(counter)
 
  def isPossible(c: Int): Boolean = {
    val choice = String.format("%" + n + "s", Integer.toBinaryString(c)).replace(' ', '0').toCharArray.map(_ - '0').zipWithIndex.filter(_._1 == 1).map(_._2)
    for (c<-choice){
      print(c)
    }
    println
    if (choice.length < 2) false
    else {
      val total = choice.map(C(_)).sum
 
      total >= l && total <= r && (C(choice(choice.length - 1)) - C(choice(0)) >= x)
    }
  }
}