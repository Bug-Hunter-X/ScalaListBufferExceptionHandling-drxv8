```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val list = new ListBuffer[Int]()
  list += 1
  list += 2
  list += 3

  // Check the index before accessing
  if (list.size > 3 && 3 >=0) {
    println(list(3))
  } else {
    println("Index out of bounds")
  }
}
```