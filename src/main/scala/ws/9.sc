
def square(x: => Int) = x * x

def value = {
  println("called")
  10
}

square(value)

val map = Map(1 -> "a")

def heavyComputation = {
  println("called")
  "heavyComputation"
}

map.getOrElse(1, heavyComputation)

