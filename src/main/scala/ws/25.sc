import data.{Book, Data}

Data.books
  .filter(_.basePrice > 100)
  .map(_.title)

val pf: PartialFunction[Book, String] = {
  case book if book.basePrice > 100 => book.title
}

Data.books.collect(pf)
Data.books.filter(pf.isDefinedAt).map(pf)


Data.books.map {
  case Book("odersky", title, _, _) => title
  case book if book.basePrice < 200 => book.title
  case book                         => book.author
}

