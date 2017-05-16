/* Create a package test.mymath in the same project
Create a test class MyCalculatorTest in the package and implement test cases to challenge the functionality of 
all methods in the MyCalculator class
Be sure that
you use appropriate names for the test cases
edge numbers are tested
exceptions are also tested */


package test.myMath;

import org.junit.*;

import main.myMath.MyCalculator;

public class MyCalculatorTest {
	
	
//Fields
	MyCalculator calc;
	private double y;
	private double x;
		
//Testing methods
	
	@Before  //this method will run before any other method and initialises the instance variable so that we don't do it every single time
	public void initialize(){
		calc = new MyCalculator();
	}
	
	@Test
	public void testCheckSignShouldReturnPositive() {
		Assert.assertEquals("positive", calc.checkPositive(5));
		Assert.assertEquals("positive", calc.checkPositive(0));
	}
	
	@Test
	public void testCheckSignShouldReturnNegative() {
		Assert.assertEquals("negative", calc.checkPositive(-5));
		Assert.assertEquals("negative", calc.checkPositive(-10));
	}
	
	@Test
	public void testNoOverflowPositiveNums(){
		Assert.assertEquals(11, calc.addition(5, 6),0);	//it needs the tolerance 
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testAdditionShouldThrowIllegalArgumentException() {
		calc.addition(-5, -6);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testAdditionShouldThrowArithmeticException(){
		calc.addition(Integer.MAX_VALUE, 2);
	}
	
	@Test 
	public void testMultiplication(){
		Assert.assertEquals(10, calc.multiplication(2, 5),0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testShouldThrowIllegalArgumentException() {
		calc.multiplication(-5, 2);
	}	
	
	@Test (expected = ArithmeticException.class)
	public void testShouldThrowArithmeticException(){
		calc.multiplication(Integer.MAX_VALUE, 2);
	}
	
	@Test 
	public void testDevision(){
		Assert.assertEquals(5, calc.division(20, 4), 0);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testShouldThrowArithmeticExceptionDueToNum(){
		calc.division(Integer.MAX_VALUE, 0.1);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testShouldThrowArithmeticExceptionDueToDenom(){
		calc.division(1, Integer.MIN_VALUE);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testShouldThrowArithmeticExceptionDueToDenomZero(){
		calc.division(5, 0);
	}
	
}
