/**
  * Created by samsung on 2017/7/21.
  */
object Demo3 {
  def main(args: Array[String]): Unit = {
    val x = 1
    //判断x的值，将结果赋值给y
    val y = if (x > 0) 1 else -1
    //打印y的值
    println(y)
    //支持混合类型表达式
    val z = if (x > 1) 1 else "error"
    //打印z的值
    println(z)
    //如果缺失else相当于if(x>2)1 else ()
    val m = if (x > 2) 1
    println(m)
    //在scala中每个表达式都有值，scala中有个unit类写作（） 相当于java中的void
    val n = if (x > 2) 1 else ()
    println(n)
    //if和else if
    val k = if (x < 0) 0
    else if (x >= 1) 1 else -1
    println(k)
    //块表达式
    val x1 = 0
    //在scala中{}可以包含一系列表达式，块中最后一个表达式的值就是块的值
    //下面就是一个块表达式
    val result = {
      if (x1 < 0) {
        -1
      } else if (x1 >= 1) {
        1
      } else {
        "error"
      }
    }
    //result的值就是块表达式的结果
    println(result)
    //循环，for循环的主要语法结构 for(i<-表达式/数组/集合)
    for (i <- 1 to 10) //每次循环都将区间的值赋给i
      println(i)
    //for(i<-数组) 这个数组是不可变数组
    val arr = Array("a", "b", "c")
    for (i <- arr)
      println(i)
    //高级for循环
    //每个生成器都可以带一个条件，注意if前面没有分号
    //相当于java中的双重for循环
    for (i <- 1 to 3; j <- 1 to 3 if i != j)
      print((10 * i + j) + " ")
    println()
    //for推导式：如果for循环的循环体以yield开始，则该循环会构建出一个集合
    //每次迭代生成集合中的一个值
    val v = for (i <- 1 to 10) yield i * 10
    println(v)


  }

  //方法的定义以及函数的调用、返回值可以不写，但是对于递归函数就一定
  //要写
  def m1(x: Int, y: Int): Int = x * y

  //定义函数
  val f1 = (x1: Int, y1: Int) => x1 + y1
  //在函数式编程当中，函数是头等公民，它可以像其他数据类型一样可以传递参数和操作
  def m2(f:(Int,Int)=>Int)=f(2,6)//定义一个方法
  val f2=(x1:Int,y1:Int)=>x1*y1//定义一个函数
  m2(f2)//通过函数向方法传递参数


}
