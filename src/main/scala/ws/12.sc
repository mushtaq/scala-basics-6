import scala.util.control.NonFatal

try 1 / 0 catch {
  case NonFatal(ex) => ex.getMessage
  case ex           => ex.getMessage
}

sealed trait MyList[+T]
object MyList
case object MyNil extends MyList[Nothing]
case class ::[T](head: T, tail: MyList[T]) extends MyList[T]

val xs = ::(1, ::(2, ::(3, MyNil)))


def length[T](xs: MyList[T]): Int = xs match {
  case MyNil => 0
  case head :: tail => length(tail) + 1
}

length(xs)

def reverse[T](xs: MyList[T])= {
  def loop(rem: MyList[T], acc: MyList[T]): MyList[T] = rem match {
    case MyNil => acc
    case ::(head, tail) => loop(tail, ::(head, acc))
  }
  loop(xs, MyNil)
}

reverse(xs)
