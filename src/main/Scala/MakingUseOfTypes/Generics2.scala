package MakingUseOfTypes

import java._

object Generics2 {
  var list1 = new util.ArrayList[Int]
  var list2 = new util.ArrayList
  //list2 = list1  //编译错误
}
