
def int2String(x: Int): String = x.toString

def string2List(x: String): List[Char] = x.toList

string2List(int2String(100))

val f1 = int2String _
val f2 = string2List _

val f3 = f2 compose f1
val f4 = f1 andThen f2

f3(100)
f4(100)

