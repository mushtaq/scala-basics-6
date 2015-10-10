
object B {
  def age = 100
  val name = "asasd"
  private var canSpeak = true
}

class B {
  B.canSpeak = false
}
new B
new B
new B
new B
new B


class A

object A extends A

val a = new A
val b = new A

a: a.type
a: a.type

def m(x: A.type ) = x

a: A
A: A.type

class Person(val name: String, var canSpeak: Boolean) extends AnyRef {
}


val p = new Person("asdasd", true)
val p2 = new Person("asdasd", false)

p.name
p.name

p.canSpeak
p.canSpeak
p.canSpeak = false
p.canSpeak
