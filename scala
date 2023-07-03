//01
object InterestCalculator extends App {
  def calculateInterest(depositAmount: Double): Double = {
    val interestRate =
      if (depositAmount <= 20000) 0.02
      else if (depositAmount <= 200000) 0.04
      else if (depositAmount <= 2000000) 0.035
      else 0.065
    depositAmount * interestRate
  }
  val deposit = 50000
  val interest = calculateInterest(deposit)
  println(s"The interest earned on a deposit of Rs. $deposit is Rs. $interest")
}

//03
object StringFormatter extends App {
  def toUpper(input: String): String = input.toUpperCase

  def toLower(input: String): String = input.toLowerCase

  def formatNames(name: String)(formatFunction: String => String): String = formatFunction(name)

  val names = List("Benny", "Niroshan", "Saman", "Kumara")

  names.foreach { name =>
    val formattedName = formatNames(name) {
      case n if n.length % 2 == 0 => toUpper(n)
      case other => toLower(other) // Use `other` instead of `n` to fix the error
    }
    println(formattedName)
  }
}

//02
object Tutorial4_Q2 {
  def main(args: Array[String]): Unit = {
    print("Input a number: ")
    val number = scala.io.StdIn.readInt()

    println("The number that you've input is " + message(number))
  }

  def message(n: Int): String = n match {
    case n if n <= 0 => "a Negative number or a Zero."
    case n if n % 2 == 0 => "an Even Number."
    case _ => "an Odd Number."
  }
}
