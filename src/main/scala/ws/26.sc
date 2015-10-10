

def add(a: Int)(b: Int)(c: Int): Int =
  a + b + c

add(10)(20)(30)

add(10)(20) _
add(10) _

val f = add _

val f2 = f(10)
val f2a = f(10)(34)

val f3 = f2(20)

f3(20)
f2a(20)




