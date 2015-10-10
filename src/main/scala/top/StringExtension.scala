package top

object StringExtension {

  class RichString(val string: String) extends AnyVal {
    def hello = s"Hello $string"
  }

  implicit def asdasdasd(string: String): RichString = new RichString(string)

  implicit def int2String(int: Int) = s"Hello $int"
}
