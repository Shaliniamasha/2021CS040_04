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
