package top

trait Ord[T] {
  def lt(a: T, b: T): Boolean
}

object Ord {

  implicit class RichT[T](val x: T) extends AnyVal {
    def <(y: T)(implicit ev: Ord[T]) = ev.lt(x, y)
  }

  def apply[T](implicit x: Ord[T]) = x

  implicit val intOrd: Ord[Int] = new Ord[Int] {
    def lt(a: Int, b: Int) = a < b
  }

  implicit val doubleOrd: Ord[Double] = new Ord[Double] {
    def lt(a: Double, b: Double) = a < b
  }

  implicit object strOrd extends Ord[String] {
    def lt(a: String, b: String) = a < b
  }

  implicit def optOrd[T: Ord]: Ord[Option[T]] = new Ord[Option[T]] {
    def lt(a: Option[T], b: Option[T]) = (a, b) match {
      case (Some(x), Some(y)) => Ord[T].lt(x, y)
      case (Some(x), None)    => false
      case (None, Some(y))    => true
      case (None, None)       => true
    }
  }

  implicit def tuple2Ord[X: Ord, Y: Ord]: Ord[(X, Y)] = new Ord[(X, Y)] {
    def lt(a: (X, Y), b: (X, Y)) = {
      val ((ax, ay), (bx, by)) = (a, b)
      if (Ord[X].lt(ax, bx)) true
      else if (Ord[X].lt(bx, ax)) false
      else Ord[Y].lt(ay, by)
    }
  }
}
