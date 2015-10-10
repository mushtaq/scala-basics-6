import data.Data

val (a, b) = Data.books partition(_.basePrice < 100)

List(2, 5, 6, 2, 3).splitAt(2)

List(2, 5, 6, 2, 3).takeWhile(_ < 6)
List(1)

val xs = List(1, 2, 3)
val ys = List("a", "b", "c")

xs
  .filter(_ > 1)
  .foreach {
    x => ys
      .filter(_ == "b")
      .foreach(y => println(x, y))
  }

val zs = for {
  x <- xs
  z = x + 10
  if x > 1
  y <- ys
  if y == "b"
} {
    val f = 20
    println(x, y, f, z)
  }

