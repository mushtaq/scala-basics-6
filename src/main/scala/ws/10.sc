
def While(_cond: => Boolean)(block: => Unit): Unit = {
  lazy val cond = _cond
  if (cond) {

    block
    While(cond)(block)
  }
}

var x = 0

While(x < 10) {
  println(x)
  x = x + 1
}

