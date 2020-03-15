package MakingUseOfTypes

import java._

object Generics3 {
  var list1 = new util.ArrayList[Int]
  var list2 = new util.ArrayList[Any]

  var ref1: Int = 1
  var ref2: Any = _

  ref2 = ref1  //编译正确
  //list2 = list1 //编译错误
}