import scala.io.Source;

object hello {
  def main(args: Array[String]): Unit = {
    //可以存放任意类型的数据
    val triple = (100, "scala", "spark")
    println(triple._1)
    println(triple._2)

    val array = Array(1, 2, 3, 4, 5)
    /* for (i<-0 until(array.length)){
       println(array(i))
     }
     这种写法是比较繁琐的*/
    //这种写法是推荐的
    for (enum <- array) {
      println(enum)
    }

    val ages = Map("Rocky" -> 27, "saprk" -> 5)
    //遍历一个集合map集合的方式
    for ((k, v) <- ages) {
      println("key is " + k, "value is " + v)
    }
    //读取文件的操作
    val file = Source.fromFile("E:\\welcome.txt")
    for (line <- file.getLines()) {
      println(line)
    }
    //创建数组
    val array1 = Array(1, 2, 3, 4, 3, 5, 6)
    for (ages <- array1) {
      println(ages)
    }

    //println("wo shi spark");
    // doWhile
    /*println(looper(12L, 123L))
    for(i <- 1 to(10)){
      println(i)
    }*/
    /* val files= new File(".").listFiles()
     for(files<-files){
       println(files)
     }*/
    /* try {

    } catch {
      case t: Exception => t.printStackTrace()
    }finally {

    }
  }*/
    def doWhile() {
      var line = ""
      do {
        line = readLine()
        println("read" + line)
      } while (line != "")
    }

    /*def looper(x: Long, y: Long): Long = {
    var a = x
    var b = y
    b
  }*/

  }
}