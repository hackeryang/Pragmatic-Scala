package MakingUseOfTypes

object MyList {
  class MyList[+t]  //...
  var list1 = new MyList[Int]
  var list2: MyList[Any] = _
  list2 = list1  //编译正确
}
