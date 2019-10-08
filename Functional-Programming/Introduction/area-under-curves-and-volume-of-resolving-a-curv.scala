object Solution {
  // This function will be used while invoking "Summation" to compute
  // The area under the curve.
  def f(coefficients: List[Int], powers: List[Int], x: Double):Double = {
    // Fill Up this function body
    // To compute the value of the function
    // For the given coefficients, powers and value of x
    ((coefficients zip powers) :\ 0.0) { (k, res) => res + k._1 * math.pow(x, k._2) }
  }

  // This function will be used while invoking "Summation" to compute 
  // The Volume of revolution of the curve around the X-Axis
  // The 'Area' referred to here is the area of the circle obtained
  // By rotating the point on the curve (x,f(x)) around the X-Axis
  def area(coefficients: List[Int], powers: List[Int], x: Double): Double = {
    // Fill Up this function body
    // To compute the area of the circle on revolving the point
    // (x,f(x)) around the X-Axis
    // For the given coefficients, powers and value of x
    val r = f(coefficients, powers, x)
    math.pow(r, 2) * math.Pi
  }

  // This is the part where the series is summed up
  // This function is invoked once with func = f to compute the area under the curve
  // Then it is invoked again with func = area to compute the volume 
  // of revolution of the curve
  def summation(func: (List[Int], List[Int], Double) => Double, upperLimit: Int, 
    lowerLimit: Int, coefficients: List[Int], powers: List[Int]): Double = {
    // Fill up this function
    val interval = 0.001d
    (lowerLimit * 1d to upperLimit * 1d by interval).map(interval * func(coefficients, powers, _)).sum
  }

  // The Input-Output functions will be handled by us. You only need to concentrate your effort on the function bodies above.
  def displayAnswers(coefficients: List[Int], powers: List[Int], limits: List[Int]) {
    println(summation(f,limits.reverse.head,limits.head,coefficients,powers))
    println(summation(area,limits.reverse.head,limits.head,coefficients,powers))
  }

  def main(args: Array[String]) {
    /** Purely IO Section **/
    displayAnswers(readLine().trim().split(" ").toList.map(_.toInt),readLine().trim().split(" ").toList.map(_.toInt),readLine().trim().split(" ").toList.map(_.toInt))
  }
}
