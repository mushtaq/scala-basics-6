
val xo = Option(1)
val yo = Option(8)

xo.flatMap(x => yo.map(y => x + y))

for {
  x <- xo
  if x > 0
  y <- yo
  y < 20
} yield x + y


