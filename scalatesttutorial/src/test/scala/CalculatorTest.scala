class CalculatorTest extends org.scalatest.FunSuite {
    test("Calculator.square"){
        assert(Calculator.square(2) === 4)
        assert(Calculator.square(3) === 9)
    }
    test("CubeCalculator.cube") {
        assert(CubeCalculator.cube(2) === 8)
        assert(CubeCalculator.cube(1) === 1)
    }
}