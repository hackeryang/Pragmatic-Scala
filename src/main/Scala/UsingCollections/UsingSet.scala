package UsingCollections

object UsingSet {
  val colors1 = Set("Bule", "Green", "Red")
  println(s"colors1: $colors1")

  val colors2 = colors1 + "Black"
  println(s"colors2: $colors2")
  println(s"colors1: $colors1")

  val feeds1 = Set("blog.toolshed.com", "pragdave.me", "blog.agiledeveloper.com")
  val feeds2 = Set("blog.toolshed.com", "martinfowler.com/bliki")

  val blogFeeds = feeds1 filter (_ contains "blog")
  println(s"blog feeds: ${blogFeeds.mkString(", ")}")

  val mergedFeeds = feeds1 ++ feeds2
  println(s"# of merged feeds: ${mergedFeeds.size}")

  val commonFeeds = feeds1 & feeds2
  println(s"common feeds: ${commonFeeds.mkString(", ")}")

  val urls = feeds1 map ("http://" + _)
  println(s"One url: ${urls.head}")

  println("Refresh Feeds:")
  feeds1 foreach { feed => println(s" Refreshing $feed...") }
}
