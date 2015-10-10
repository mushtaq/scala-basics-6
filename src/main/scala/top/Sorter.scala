package top

import top.Ord.RichT

object Sorter {

  def sort[T: Ord](xs: List[T]): List[T] = xs match {
    case Nil      => Nil
    case x :: xs1 => insert(x, sort(xs1))
  }

  def insert[T: Ord](x: T, xs: List[T]): List[T] = xs match {
    case Nil                      => List(x)
    case head :: tail if x < head => x :: xs
    case head :: tail             => head :: insert(x, tail)
  }
}

object Sorter2 {

  def sortBy[T, S: Ord](xs: List[T])(f: T => S): List[T] = xs match {
    case Nil      => Nil
    case x :: xs1 => insertBy(x, sortBy(xs1)(f))(f)
  }

  def insertBy[T, S: Ord](x: T, xs: List[T])(f: T => S): List[T] = xs match {
    case Nil                            => List(x)
    case head :: tail if f(x) < f(head) => x :: xs
    case head :: tail                   => head :: insertBy(x, tail)(f)
  }
}
