val email = "mushtaq@tw.com"
val arr = email.split("@")
arr(0)
arr(1)
object Email {
  def unapply(str: String): Option[(String, String)] =
    str.split("@") match {
      case Array(name, domain) => Some((name, domain))
      case _                   => None
    }
}

val Email(name1, domain1) = email
def m(string: String) = string match {
  case Email("mushtaq", domain2) if domain2.startsWith("tw") => s"Hello Mr Scala from ThoughtWorks"
  case Email("mushtaq", domain2) => s"Hello Mr Scala of domain $domain2"
  case Email(name2, domain2) => s"Hello $name2 of domain $domain2"
  case _                     => "error"
}
m("mushtaq@tw.com")
m("mushtaq@asdasd.com")
m("someoe@asdasd.com")
m("mushtaq@tw.com@asdasd")
m("asdasd")

