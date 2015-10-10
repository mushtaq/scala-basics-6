val list: List[String] = List("a", "b", "c", "d")



val set: Set[String] = Set("a", "b", "a")

list.filter(set)

val map: Map[Int, String] = Map(1 -> "a", 2 -> "b", 3 -> "c")

List(1, 2).map(map)



list: Int => String

set: String => Boolean

map: Int => String


list(1)

set("a")

map(1)
map(2)







