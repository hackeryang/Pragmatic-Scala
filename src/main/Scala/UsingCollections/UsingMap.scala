package UsingCollections

object UsingMap {
  val feeds = Map(
    "Andy Hunt" -> "blog.toolshed.com",
    "Dave Thomas" -> "pragdave.me",
    "NFJS" -> "nofluffjuststuff.com/blog"
  )

  val filterNameStartWithD = feeds filterKeys (_ startsWith "D")
  println(s"# of Filtered: ${filterNameStartWithD.size}")

  val filterNameStartWithDAndPragprogInFeed = feeds filter { element =>
    val (key, value) = element
    (key startsWith "D") && (value contains "pragdave")
  }
  print("# of feeds with auth name D* and pragdave in URL: ")
  println(filterNameStartWithDAndPragprogInFeed.size)

  println(s"Get Andy's Feed: ${feeds.get("Andy Hunt")}")
  println(s"Get Bill's Feed: ${feeds.get("Bill Who")}")

  try {
    println(s"Get Andy's Feed Using apply(): ${feeds("Andy Hunt")}")
    print("Get Bill's Feed: ")
    println(feeds("Bill Who"))
  } catch {
    case _: java.util.NoSuchElementException => println("Not found")
  }

  val newFeeds1 = feeds.updated("Venkat Subramaniam", "blog.agiledeveloper.com")
  println("Venkat's blog in original feeds: " + feeds.get("Venkat Subramaniam"))
  println("Venkat's blog in new feed: " + newFeeds1("Venkat Subramaniam"))

  val mutableFeeds = scala.collection.mutable.Map(
    "Scala Book Forum" -> "forums.pragprog.com/forums/87"
  )
  mutableFeeds("Groovy Book Forum") = "forums.pragprog.com/forums/246"
  println(s"Number of forums: ${mutableFeeds.size}")
}
