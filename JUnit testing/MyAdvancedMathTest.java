package test.myMath;

import org.junit.*;

import main.myMath.MyAdvancedMath;

public class MyAdvancedMathTest {
	
//fields
	MyAdvancedMath math;
	
	@Before
	public void initialize(){
		math = new MyAdvancedMath();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testShouldThrowIllegalArgumentExceptionNNegativeFactorial() {
		math.factorial(-1);
	}	
	
	@Test (expected = IllegalArgumentException.class)
	public void testShouldThrowIllegalArgumentExceptionNTooGreatFactorial(){
		math.factorial(13);
	}
	
	@Test
	public void testShouldRunWellFactorial(){
		math.factorial(5);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void  testShouldThrowIllegalArgumentExceptionNOutOfBoundsPower20(){
		math.power(2, 21);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void  testShouldThrowIllegalArgumentExceptionNOutOfBoundsPower0(){
		math.power(2, -1);
	}
	
	@Test
	public void testShouldRunWellPow(){
		math.power(2, 4);
	}
	
	@Test
	public void testShouldReverseArary(){
		int[] array = {6, 5, 4, 3, 2, 1};
		Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, this.math.reverseArary(array));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testShouldThrowIllegalArgumentExceptionArrayEmpty(){
		int[] array = new int[0];
		math.reverseArary(array);
	}
}
