/**
  * Created by samsung on 2017/7/22.
  * 遍历数组
  */
object Demo5 {
  def main(args: Array[String]): Unit = {
    //初始化一个数组
    val arr = Array(1, 2, 3, 4, 5, 6, 4)
    //增强for循环
    for (i <- arr)
      println(i)
    //好用的until会生成一个range
    //reverse是将前面生成的range反转 包头不包尾
    for (i <- (0 until arr.length).reverse)
      println(arr(i))
    //使用for循环，将数组进行转换 yield关键字将原始的数组转换会产生一个新的数组，原始的数组不会发生改变
    //定义一个数组，
    val arr1 = Array(1, 3, 2, 3, 4, 3)
    //将偶数取出乘以10再生成一个新的数组
    val res = for (e <- arr if e % 2 == 0) yield e * 10
    println(res.toBuffer)
    //高级的写法
    //filter是过滤，接收一个返回值为boolean的函数
    //map相当于将数组中的每个元素取出来，应用传进去的函数
    val r = arr.filter(_ % 2 == 0).map(_ * 10)
    println(r.toBuffer)
    //数组常用的算法
    //求和
    arr.sum
    //求最大值
    arr.max
    //排序
    arr.sorted

  }
}
