
val t = (1, "a")
val t1 = Tuple2(1, "a")

val (fst, snd) = t
val Tuple2(fst1, snd1) = t
fst
snd
fst1
snd1
class Address(pin: Int, street: String)

object FullAddress {
  def unapply(address: Address) =
    Option(s"Hello from ${address}")
}

case class Person(name: String, address: Address)

val p = Person("ashish", new Address(131, "pashan"))

//val Person(name1, Address(pin1, street1)) = p
val Person(name2, FullAddress(value)) = p

