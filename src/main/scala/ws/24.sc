
val pf1: PartialFunction[Int, String] = {
  case x if x > 100 => "one"
}

val pf2: PartialFunction[Int, String] = {
  case 2 => "hello"
  case 3 => "333"
}

val pf3: PartialFunction[Int, String] = {
  case 20 => "20"
}

val pf = pf1.orElse(pf2).orElse(pf3)

val f = pf.lift

pf.isDefinedAt(2)
pf(2)

