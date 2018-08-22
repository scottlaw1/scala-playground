object CubeCalculator extends App with Math_Cube{
}

trait Math_Cube{
  def cube(x: Int) = {
    x * x * x
  }
}

trait Math_Square{
  def square(x: Int) : Int
}