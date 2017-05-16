/* Write a program that calculates the first five terms of the harmonic sequence, that is, the numbers:
These are the numbers:
1
1.5
1.8333333333333333
2.083333333333333
2.283333333333333
*/
import java.util.Scanner;
public class ExerciseIntroduction4{
	public static void main(String[] Args){

		double a=1;
		System.out.println(a);

		for(int j=2; j<=5; j++){
			a=a+(1.00/j);
			System.out.println(a);
		}


	}
}