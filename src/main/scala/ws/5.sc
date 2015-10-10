import data.AliceData
import data.Data.books

val words = AliceData.bookText.split("""[\s|:|.|,|"]+""").map(_.toLowerCase)

val stopWords = AliceData.stopWordText.split("\\s+").map(_.toLowerCase).toSet

words.view
  .filterNot(stopWords)
  .map(_ -> 1)
  .groupBy(_._1)
  .map(t => t._1 -> t._2.length)
  .toSeq
  .sortBy(_._2)
  .reverse
  .take(10)








