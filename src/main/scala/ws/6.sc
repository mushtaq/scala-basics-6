import data.AliceData
import data.Data.books

val words = AliceData.bookText.split("""[\s|:|.|,|"]+""").map(_.toLowerCase)

val stopWords = AliceData.stopWordText.split("\\s+").map(_.toLowerCase).toSet


def reduceByKey[A, B](xs: Seq[(A, B)])(f: (B, B) => B): Seq[(A, B)] = {
  val it = xs.iterator
  var result = Map.empty[A, B]

  while (it.hasNext) {
    val t = it.next()
    val key = t._1
    val value = t._2
    val maybeValue = result.get(key)
    if(maybeValue.isDefined) {
      result  = result + (key -> f(value, maybeValue.get))
    } else {
      result  = result + t
    }
  }

  result.toSeq
}




