/**
  * Created by samsung on 2017/7/20.
  *
  */
object Demo1 {
  def main(args: Array[String]): Unit = {
    val lst0 = List(1, 7, 3, 2, 1, 3, 4)
    println(m1(2, 3))
    val r = 1 to 10 //集合 _一个匿名函数
    print(r.map(x => x * 100))
    print(r.map((x: Int) => x * 100))
    print(r.map(_ * 100))
    print(r.map(f2))
    val result = m7(func)
    val str: String = "briup"

  }

  //方法
  def m1(a: Int, b: Int): Int = a * b

  //函数,函数可以作为参数运行在方法当中
  val f1 = (x: Int, y: Int) => x + y
  val f2 = (x: Int) => x * 10
  val f0 = (x: Int, y: Int) => x + y

  //变量中引用函数  输入参数，返回参数
  def m7(f: Int => Int): Int = {
    /*val f6=f
    f6(3)
    最后一行会自动返回*/
    f(3)
  }

  val func = (x: Int) => x * 10
  val arr = Array(1, 2, 3, 4, 5, 5)
  val r1 = arr.map(x => x * 5)
  val r2 = arr.map(x => x - 1)
  r1.toBuffer
  val x = 1
  val y = if (x > 0) 1 else -1
  //for循环语法结构 for(i<-表达式/数组/集合)


}
