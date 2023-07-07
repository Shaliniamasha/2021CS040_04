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
object StringFormatter {
  def toUpper(input: String): String = {
    val firstTwoChars = input.take(2)
    val remainingChars = input.drop(2)
    firstTwoChars.toUpperCase() + remainingChars
  }

  def toLower(input: String): String = {
    val firstChar = input.head.toLower
    val remainingChars = input.tail
    firstChar + remainingChars.toLowerCase()
  }

  def formatNames(name: String)(formatter: String => String): String = {
    formatter(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    names.foreach { name =>
      val formattedName = formatNames(name) {
        case s if s.length > 2 && s.charAt(1).isLower => toUpper(s)
        case s => toLower(s)
      }
      println(formattedName)
    }
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
