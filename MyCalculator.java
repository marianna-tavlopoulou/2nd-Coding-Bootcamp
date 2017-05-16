package main.myMath;

/*In this package create a class MyCalculator that implements a calculator and provides the following 
 * functionalities (methods)
 *  for any pair of positive integers :
addition
multiplication
division

Consider checking the input numbers for their illegibility. For example:
the denominator of the division cannot be zero,
input numbers should not result to overflow (ex. the result of adding two double numbers should fit in a double
 variable)
think of more cases if exist..
In cases that the input values violate your constraints, you should throw an IllegalArgumentException with a
 corresponding message
*/
public class MyCalculator {
	
//fields
	Double x;
	Double y;
	
//methods
	
	public String checkPositive(Integer x){
		if(x >= 0){
			return "positive";
		}else{
			return "negative";
		}
	}
	
	//addition
	public double addition(double x, double y){
		if(x<0 || y<0){
			throw new IllegalArgumentException("The numbers are not positive");
		}else if(x > Integer.MAX_VALUE - y){
			throw new ArithmeticException("The numbers are too great");
		}else{
			return  x+y;
		}
	}
	
	//multiplication
	public double multiplication(double x, double y){
		if(x<0 || y<0){
			throw new IllegalArgumentException("The numbers are not positive");
		}else if(x > Integer.MAX_VALUE / y && y != 0){
			throw new ArithmeticException("The numbers are too great");
		}else{
			return  x*y;
		}
	}
	
	//division
	public double division(double num, double denom){
		if(denom == 0){
			throw new ArithmeticException("You cannot devide with zero!");
		}else if(num > Integer.MAX_VALUE * denom){
			throw new ArithmeticException("The result number is too great");
		}else{
			return num/denom;
		}
	}
	
}
