import top.{Ord, Sorter}

Sorter.sort(List(1, 50, 6, 13))
Sorter.sort(List("abc", "zer", "ftg"))

Sorter.sort(List(Option(11), Option(1), Option.empty[Int], Option(10)))
Sorter.sort(List(Option("zer"), Option("abc"), Option.empty[String], Option("ftg")))

Sorter.sort(List((11, "a"), (11, "b"), (1, "z"), (1, "e"), (5, "x")))

object A {
  implicit val intOrd: Ord[Int] = new Ord[Int] {
    def lt(a: Int, b: Int) = a > b
  }
}
{
  import A.intOrd
  Sorter.sort(List(
    (Option(11), Option("a")),
    (Option(11), Option("b")),
    (Option(1), Option("z")),
    (Option(1), Option.empty[String]),
    (Option.empty[Int], Option("x")))
  ).foreach(println)
}


