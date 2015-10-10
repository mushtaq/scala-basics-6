"": String
Array(1): Array[Int]

1.+(3)

val xs = List(1, 2, 3, 4)

xs map (_ + 1)

1 :: 2 :: 3 :: 4 :: Nil
Nil.::(4).::(3).::(2).::(1)

xs match {
  case head :: tail => head
  case e1 :: e2 :: e3 :: tail => e1
}

