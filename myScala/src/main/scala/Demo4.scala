/**
  * Created by samsung on 2017/7/22.
  */

import scala.collection.mutable.ArrayBuffer

object Demo4 {
  def main(args: Array[String]): Unit = {
    //定义一个方法
    //方法m2参数要求是一个函数，函数的参数必须是两个int类型
    //返回值类型也是int类型

  }

  def m1(f: (Int, Int) => Int): Int = {
    f(2, 6)
  }

  //定义一个函数f1，参数是两个int类型，返回值是一个int类型
  val f1 = (x: Int, y: Int) => x + y
  m1(f1)
  //再定义一个函数f2，参数是两个额int类型
  val f2 = (m: Int, n: Int) => m * n
  //将方法转换为函数 神奇的下划线
  val f3 = m1 _
  //==数组的定义，定长数组和变长数组======
  //初始化一个长度为8的定长数组，其所有元素初始化为0
  val arr1 = new Array[Int](8)
  //直接打印定长数组内容，内容为数组的hashcode
  //将数组转换成数组缓冲，就可以看到原数组中的内容
  arr1.toBuffer
  //注意：如果new 相当于调用了数组的apply
  //方法，直接为数组赋值
  //初始化一个长度为1的定长数组
  val arr2 = Array[Int](10)
  println(arr2.toBuffer)
  //第一个长度为3的定长数组
  val arr3 = Array("hadoop", "strom","spark")
  //使用（）来访问元素
  println(arr3(2))
  //===变长数组，数组的缓冲
  val ab = ArrayBuffer[Int]()
  //向缓冲数组的尾部追加一个元素
  //+=尾部追加元素
  ab += 1
  //追加多个元素
  ab += (2, 3, 4, 5)
  //追加一个数组++=
  ab ++= Array(6, 7)
  //追加一个数字缓冲
  ab ++= ArrayBuffer(8, 9)
  //在数组的某个位置插入元素用insert
  ab.insert(0, -1, 0)
  //删除数组某个位置的元素用remove
  ab.remove(8, 2)
  println(ab)
}