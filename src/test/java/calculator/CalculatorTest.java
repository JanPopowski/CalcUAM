package calculator;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void init() {
        calculator = new Calculator();
    }

    //power
    @Test
    public void CalculatePowerTest() {
        Assert.assertEquals(81, calculator.powerTwoNumbers(3, 4), 0.001);
    }

    //sqrt
    @Test public void CalculateSqrtTest() {
        Assert.assertEquals(5, calculator.sqrt(25), 0.001);
    }

    //Square
    @Test
    public void CalculateSquareCircTest() {
        Assert.assertEquals(12, calculator.CalculateSquareCirc(3), 0.001);
    }
    @Test
    public void CalculateSquareAreaTest() {
        Assert.assertEquals(9, calculator.CalculateSquareArea(3), 0.001);
    }


    //Rect
    @Test
    public void CalculateRectCircTest() {
        Assert.assertEquals(8, calculator.CalculateRectCirc(2,2));
    }
    @Test
    public void CalculateRectArea() {
        Assert.assertEquals(20, calculator.CalculateRectArea(4, 5), 0.001);
    }

    //Triangle
    @Test
    public void CalculateTriangleArea() {
        Assert.assertEquals(5, calculator.CalculateTriangleArea(2, 5), 0.001);
    }
    @Test
    public void CalculateTriangleCirc() {
        Assert.assertEquals(15, calculator.CalculateTriangleCirc(4, 5, 6), 0.001);
    }

    //Temperature
    @Test
    public void ConvertCelsiusToFarenheitTest() {
        Assert.assertEquals(50, calculator.convertCelsiusToFarenheit(10), 0.001);
    }
    @Test
    public void ConvertFarenheitToCelsiusTest() {
        Assert.assertEquals(100, calculator.convertFarenheitToCelsius(212), 1);
    }

    //Speed
    @Test
    public void ConvertFromMphToKphTest() {
        Assert.assertEquals(96.6, calculator.convertFromMphToKph(60), 0.001);
    }

    //Recursive
    @Test
    public void FactorialTest() {
        Assert.assertEquals(120, calculator.factorial(5));
    }
    @Test
    public void FibbonaciTest() {
        Assert.assertEquals(6765, calculator.fibbonacci(20));
    }

    //LCM
    @Test
    public void FindLCMTest() {
        Assert.assertEquals(28, calculator.findLCM(7, 4));
    }


    //IsPrime
    @Test
    public void IsPrimeExpectedTrueTest() {
        Assert.assertEquals(true, calculator.isPrime(37));
    }
    public void IsPrimeExpectedFalse() {
        Assert.assertEquals(false, calculator.isPrime(12));
    }
}

