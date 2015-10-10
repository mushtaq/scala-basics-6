import data.Book

val name = "mushtaq"
val Name = "mushtaq"

def m(x: Any) = x match {

  case `name` =>
  case Name =>
  case 1 =>
  case true =>
  case x: Book => x.basePrice
  case x: String => x.length

}

