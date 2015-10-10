trait Day

object Day {
  case object Monday extends Day
  case object Tuesday extends Day
}



Day.Monday
Day.Tuesday

import data.Data.books

val myBooks = books.filterNot(_.basePrice == 88)

myBooks.minBy(book => (book.basePrice, book.title))


