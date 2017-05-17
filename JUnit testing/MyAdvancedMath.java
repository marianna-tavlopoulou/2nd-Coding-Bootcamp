/* Create a class named MyAdvancedMath and implement the following methods
int factorial(int n) : Calculates and returns the factorial of a given non-negative number n. If n < 0 throw an
 IllegalArgumentException("n cannot be < 0"). Also investigate which is the largest factorial that can fit in 
 an integer variable and do not allow the user (throw an IllegalArgumentException) to give an n larger than the
  value that causes an overflow. 
  
  double power(int b, int n) : Calculates and returns the power of a number, where b is the base and n is the 
  exponent. The exponent (n) can be any integer between [0, 20]. If the input is larger than that, an 
  IllegalArgumentException("n should be 0 <= n <= 20") should be thrown
int[] reverse(int[] array) which should return an array which is the reversed of the one you gave as an input
  */

package main.myMath;

public class MyAdvancedMath {

//fields
	
	
//methods
	
	//factorial
	public int factorial(int n){
		if(n<=0){
			throw new IllegalArgumentException("Number n has to be non-negative.");
		}else if (n>=12){
			throw new IllegalArgumentException("Number n is greater than 12.");
		}else{
			int res = 1;
			for(int i=1; i <= n; i++){
				res*=i;
			}
			return res;
		}
		
	}
	
	//Calculates and returns the power of a number
	public double power(int b, int n){
		int newB = b;
		if(n < 0 || n > 20){
			throw new IllegalArgumentException("n should be 0 <= n <= 20");	
		}
		if(n == 0){
			return b = 1;
		}else if(n == 1){
			return b;
		}
		for(int i=2; i <= n; i++){
			newB*=b;
		}
		return newB;
	}
	
	//int[] reverse(int[] array) which should return an array which is the reversed of the one you gave as an input
	public int[] reverseArary(int[]array){
		int[] arrayReverse = new int[array.length];
		if(array.length != 0){
			for(int i = 0; i<=array.length-1; i++){
				arrayReverse[i] = array[array.length-1-i];
			}
			return arrayReverse;
		}else{
			throw new IllegalArgumentException("Input array is empty");
		}
	}
	
}
