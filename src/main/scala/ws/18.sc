import data.{Book, Data}
import top.{Sorter2, Ord, Sorter}
List(2, 4, 5, 1).sortBy(identity)


Sorter.sort(Data.books)
Sorter2.sortBy(Data.books)(_.basePrice)

identity(10)
identity("asdads")

implicitly[Ord[Book]]