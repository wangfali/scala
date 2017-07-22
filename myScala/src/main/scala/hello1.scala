/**
  * Created by samsung on 2017/7/19.
  * object当中的属性和方法都是静态的
  */
object hello1 {
  def main(args: Array[String]): Unit = {
    //unit是返回值为空类型
    //i<- 1 to 2是指将1到2之间的数字一个一个的附给i
    for (i <- 1 to 2; j <- 1 to 2) {
      print((100 * i + j) + " ")
    }
    //这个需要我们注意
    for (i <- 1 to 2; j <- 1 to 2 if i != j) {
      print((100 * i + j) + " ")
    }

    //函数的定义
    def addA(x: Int) = x + 100 //相当于函数体
    //匿名函数
    val add = (x: Int) => x + 200 //相当于函数体//调用常量给他赋值
    println("the result from a function is " + addA(20));
    println("the result from a val id " + add(2))

    //递归调用时    必须返回函数的返回值
    def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)

    println(fac(10))

    val del =( x: Int , y: Long) => x + y
    println(del(3,5))
  }

}
