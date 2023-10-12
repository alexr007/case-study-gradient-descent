package learn3

object F01TransparentTrait extends App {

  sealed trait Animal
  case object Mice extends Animal
  case object Cat extends Animal
  case object Dog extends Animal

  def parse1(raw: String): Animal = raw match {
    case "cat" => Cat
    case "dog" => Dog
  }

  /** standard scala2 behavior */
  parse1("") match
    case Mice => ???
    case Cat  => ???
    case Dog  => ???
    case _    => ???

  def parse2(raw: String): Cat.type | Dog.type = raw match {
    case "cat" => Cat
    case "dog" => Dog
  }

  /** scala3 union type behavior */
  parse2("") match
    case Cat => ???
    case Dog => ???
//    case Mice => ??? // pattern type is incompatible with expected type
    case _ => ???

  transparent sealed trait CanFly
  case object Airplane extends CanFly
  case object Helicopter extends CanFly
  case object Paraplane extends CanFly

  def parse3(raw: String) = raw match {
    case "airplane"   => Airplane
    case "helicopter" => Helicopter
  }

  /** when we have `transparent` the default inference is Union Type */
  parse3("") match
    case Airplane   => ???
    case Helicopter => ???
//    case Paraplane  => ???

}
