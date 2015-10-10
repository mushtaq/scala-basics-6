
def reduce[A](xs: List[A])(f: (A, A) => A): A = {
  val it = xs.iterator
  var seed = it.next()
  while (it.hasNext)
    seed = f(seed, it.next())
  seed
}

val xs = List(1, 2, 3, 4)

reduce(xs)(_ + _)
reduce(xs)(_ * _)

def fold[A, B](seed: B)(xs: List[A])(f: (B, A) => B): B = {
  val it = xs.iterator
  var acc = seed
  while (it.hasNext)
    acc = f(acc, it.next())
  acc
}

def cons[T](xs: List[T], x: T) = x :: xs

fold(0)(xs)(_ + _)
fold(1)(xs)(_ * _)
fold(List.empty[Int])(xs)((acc, elem) => elem :: acc)
fold(List.empty[Int])(xs)(cons)





