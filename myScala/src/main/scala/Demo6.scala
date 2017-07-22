/**
  * Created by samsung on 2017/7/22.
  * map集合的使用
  */

import scala.collection.mutable.Map

object Demo6 {
  /**
    * 在scala中map集合有两种，一种是可变的，一种是不可变的
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    //使用箭头的方式
    val scores = Map("tom" -> 85, "jetty" -> 99, "kitty" -> 90)
    //使用元组的方式创建
    val scores1 = Map(("tom", 32), ("jetty", 99), ("kitty", 90))
    //获取map集合中的元素
    print(scores("tom"))
    print(scores1("jetty"))
    //使用getOrElse() 如果有则返回值，没有就返回默认的值
    print(scores.getOrElse("suke", 0))
    //创建可变的map集合，需要导入包
    val scores3 = Map("tom" -> 85, "jetty" -> 99, "kitty" -> 90)
    //修改集合信息
    scores3("tom") = 888
    // scores3 += ("ddvdf" -> 23)
    //scores3 += ("z" -> 323, "y" -> 321)
    scores3 += ("y" -> 321)
    for (i <- scores3.keySet) {
      println(scores3(i))
    }
    //模式匹配遍历
    for ((x, y) <- scores3) println("键：" + x + "  值：" + y)
    //foreach遍历
    scores3.foreach({ case (x, y) => println("键：" + x + "  值：" + y) })

  }
}
