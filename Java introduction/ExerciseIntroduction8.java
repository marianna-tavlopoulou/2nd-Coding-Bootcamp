/* Write a program that asks the user for a 10-digit number and will then print it in two lines. The first line will contain the numbers
in the odd positions and the second line the numbers in the even positions. For example:
Enter 10 digit number: 1234567890
1 3 5 7 9
 2 4 6 8 0
Take care so that the numbers line up in columns exactly as in the above example: each number must be in a column by itself.
 */
import java.util.Scanner;
import java.util.Arrays;
 public class ExerciseIntroduction8{
	 public static void main(String[] Args){

		System.out.println("Enter a 10-digit number:");
		Scanner scan= new Scanner(System.in);
		String digit= scan.nextLine();

		int[] arr= new int[10];
		System.out.println('\n');

		for(int i= 0; i<arr.length; i++){
			String digitStr= digit.substring(i, i+1);
			arr[i]= Integer.parseInt(digitStr);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println('\n');

		int counterEven= 0;
		int counterOdd= 0;
		for(int x: arr){
			if(x%2==0){
				counterEven++;
			}else{
				counterOdd++;
			}
		}

		int[] arrEven= new int[counterEven];
		int[] arrOdd= new int[counterOdd];

		int k=0;
		int l=0;
		for(int x: arr){
			if(x%2==0){
			arrEven[k]=x;
			k++;
			}else if(x%2!=0){
			arrOdd[l]=x;
			l++;
			}
		}
		for(int x:arrOdd){
			System.out.print(x);
			System.out.print(" ");
		}
		System.out.println('\n');
		for(int x:arrEven){
			System.out.print(" ");
			System.out.print(x);
		}
		System.out.println('\n');
	}
}

