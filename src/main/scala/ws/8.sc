
case class Address(pin: Int)
case class Person(name: String, address: Address)
object Person {

}

val p1 = Person.apply("a", Address(413))
val p2 = Person("b", Address(513))
val p3 = Person("b", Address(513))

p1 == p2
p2 == p3


p1.hashCode()
p2.hashCode()
p3.hashCode()

p1.name
p1.address
p1 == p1.copy()
p1.copy(name = "asdasd")
p1.copy(address = p1.address.copy(100))



