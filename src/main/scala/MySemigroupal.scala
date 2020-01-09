package notes

import cats.Semigroupal
import cats.instances.option._
import cats.syntax._
import cats.implicits._

object MySemigroupal {
  val optA = 10.some
  val optB: Option[String] = Some("cats")
  val optC = 100.00.some

  val result = Semigroupal[Option].product(optA, optB)

  val tuple3 = Semigroupal.tuple3(optA, optB, optC)

  val map3 = Semigroupal.map3(optA, optB, optC)(_ + _ + _)

  val tuple3Apply = (optA, optB, optC).tupled

  case class Cat(name: String, born: Int, color: String = "red")

  val catOpt = (
    Option("Garfield"),
    Option(1978),
    Option.empty[String]


    ).mapN(Cat.apply)
  //TODO 
  val redCat = (
    Option("Garfield"),
    Option(1978),
    None
    ).mapN(Cat.apply)

  //  println(catOpt)
}
