package MakingUseOfTypes

object OptionExample {
  def commentOnPractice(input: String) = {
    //而不是返回null
    if (input == "test") Some("good") else None
  }

  for (input <- Set("test", "hack")) {
    val comment = commentOnPractice(input)
    val commentDisplay = comment.getOrElse("Found no comments")
    println(s"input: $input comment: $commentDisplay")
  }
}
