/* Exercise 5
The pronic numbers are those that are the product of two consecutive integers, so that they have the form n(n+1). For example,
the first six pronic numbers are:
1*2=2
2*3=6
3*4=12
4*5=20
5*6=30
6*7=42
Write a program that asks the user the number of pronic numbers to output, then goes on and prints them:
Enter number of pronic numbers: 10
2 6 12 20 30 42 56 72 90 110 */
import java.util.Scanner;
public class ExerciseIntroduction5{
	public static void main(String[] args){

		System.out.println("Enter number of pronic numbers:");
		Scanner eisagogi= new Scanner (System.in);
		int times= eisagogi.nextInt();
		int num= 1;
		int res;


		while(num <= times){



			res=num*(num+1);

			num++;

			System.out.println(res);
		}




	}
}


