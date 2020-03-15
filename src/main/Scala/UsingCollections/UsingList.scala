package UsingCollections

object UsingList {
  val feeds = List("blog.toolshed.com", "pragdave.me", "blog.agiledeveloper.com")
  println(s"First feed: ${feeds.head}")
  println(s"Second feed: ${feeds(1)}")

  val prefixedList = "forums.pragprog.com/forums/87" :: feeds
  println(s"First Feed In Prefixed: ${prefixedList.head}")

  val feedsWithForums = feeds ::: List(
    "forums.pragprog.com/forums/87",
    "forums.pragprog.com/forums/246"
  )
  println(s"First feed in feeds with forum: ${feedsWithForums.head}")
  println(s"Last feed in feeds with forum: ${feedsWithForums.last}")

  val appendedList = feeds ::: List("agilelearner.com")
  println(s"Last Feed In Appended: ${appendedList.last}")

  println(s"Feeds with blog: ${feeds.filter(_ contains "blog").mkString(", ")}")
  println(s"All feeds have com: ${feeds.forall(_ contains "com")}")
  println(s"All feeds have dave: ${feeds.forall(_ contains "dave")}")
  println(s"Any feed has dave: ${feeds.exists(_ contains "dave")}")
  println(s"Any feeds has bill: ${feeds.exists(_ contains "bill")}")

  println(s"Feed url lengths: ${feeds.map(_.length).mkString(", ")}")

  val total = feeds.foldLeft(0) { (total, feed) => total + feed.length }
  println(s"Total length of feed urls: $total")

  val total2 = (0 /: feeds) { (total, feed) => total + feed.length }
  println(s"Total length of feed urls: $total2")

  val total3 = (0 /: feeds) { _ + _.length }
  println(s"Total length of feed urls: $total3")
}
