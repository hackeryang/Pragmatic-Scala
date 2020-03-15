package MakingUseOfTypes

object MyInterpolator {

  implicit class Interpolator(val context: StringContext) extends AnyVal {
    def mask(args: Any*): StringBuilder = {
      val processed = context.parts.zip(args).map { item =>
        val (text, expression) = item  //文本与数字值
        if (text.endsWith("^"))
          s"${text.split('^')(0)} $expression"
        else
          s"$text...${expression.toString takeRight 4}"  //takeRight函数用于取最后4个字符
      }.mkString
      new StringBuilder(processed).append(context.parts.last)  //"Thanks for your business."会被zip()过滤掉，所以这里要加上
    }
  }

}
