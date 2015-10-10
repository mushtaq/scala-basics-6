import data.Book
import data.Data.books

import scala.collection.mutable

def map[A, B](xs: List[A])(f: A => B): List[B] = {
  val iter = xs.iterator
  val buf = mutable.Buffer.empty[B]
  while (iter.hasNext) {
    buf += f(iter.next())
  }
  buf.toList
}

def map3[A, B](xs: List[A])(f: A => B): List[B] = {
  if(xs.isEmpty) {
    List.empty[B]
  } else {
    f(xs.head) :: map3(xs.tail)(f)
  }
}

def map2[A, B](xs: List[A])(f: A => B): List[B] = {
  val iter = xs.iterator
  var acc = List.empty[B]
  while (iter.hasNext) {
    acc = f(iter.next()) :: acc
  }
  acc.reverse
}

def map4[A, B](xs: List[A])(f: A => B): List[B] = {
  def loop(rem: List[A], acc: List[B]): List[B] = {
    if(rem.isEmpty) {
      acc
    } else {
      loop(rem.tail, f(rem.head) :: acc)
    }
  }
  loop(xs, List.empty[B]).reverse
}


map4((1 to 10000).toList)(_ * 33)
