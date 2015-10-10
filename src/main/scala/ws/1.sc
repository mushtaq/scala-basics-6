

class GujStat extends ((Int) => Boolean) {
  def apply(age: Int) = false
}

val mahaStat: (Int => Boolean) = new (Int => Boolean) {
  def apply(age: Int) = age > 16
}

val mahaStat1: (Int => Boolean) = { age =>
  age > 16
}

val mahaStat2 = { age: Int =>
  age > 16
}


val mahaStat3: (Int => Boolean) = (age => age > 16)

def canDrink(age: Int): Boolean= age > 16

val dd: (Int => Boolean) = canDrink
val dd2 = canDrink _



class Person(age: Int, isFemale: Boolean) {
  def isWise = if(isFemale) age > 20 else age > 30

  def canMarry(canDrink: (Int) => Boolean): Boolean =
    canDrink(age) && isWise

}

val p = new Person(100, true)

p.canMarry(new GujStat)
p.canMarry(mahaStat)
p.canMarry(asdasdasdasdasd => asdasdasdasdasd > 44)
p.canMarry(_ > 44)
p.canMarry(mahaStat2)
p.canMarry(mahaStat3)
p.canMarry(canDrink)









