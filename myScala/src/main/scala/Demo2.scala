/**
  * Created by samsung on 2017/7/21.
  * 神奇的下划线可以将方法转换为
  */

import scala.math._
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Map
object Demo2 {
  def main(args: Array[String]): Unit = {
    val str = "hello".intersect("world")
    print(str)
    val x: BigInt = 123456556
    //最大的数据容量为字符串的长度  操作符是不可以重载
    //函数，不需要通过类就可以直接调用
    val x1 = sqrt(4) //下划线是通配符
    val p = pow(2, 3) //参数的次幂
    //对偶原组

  }

  //infer  richint  强制转换、
  //类型的转换应该为to_方法
  val a: Int = 100;
  val b: Short = 100;
  a.toLong
  //scala不支持++，--，
  //scala的语法
  /** 类 class xxx{
    *
    * }
    * 伴生对象，，一个类的产生都会有伴生对象
    * 对象 object xxx{
    * 单例模式的对象
    *
    * }
    * REPL：read +eval+print+
    */
  val arr = new Array[Int](10)
  val arr1=Array(1,2,3,4,6)
  arr.toBuffer
  val a1=new ArrayBuffer[Int]()
  a1.insert(1,12)
  //增强for循环
  val m=Map()
}
