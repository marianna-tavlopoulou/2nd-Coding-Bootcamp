/* Write a program that asks the user for a 9-digit number and then prints it in three lines. Each line must contain three digits.
For example:
Enter 9 digit number: 123456789
1  4  7
 2  5  8
  3  6  9
Take care so that the numbers line up in columns exactly as in the above example: each number must be in a column by itself.
 */
 import java.util.Scanner;
 import java.util.Arrays;
  public class ExerciseIntroduction9{
 	 public static void main(String[] Args){

 		System.out.println("Enter a 9-digit number:");
 		Scanner scan= new Scanner(System.in);
 		String digit= scan.nextLine();

 		int[] arr= new int[9];
 		System.out.println('\n');

 		for(int i= 0; i<arr.length; i++){
 			String digitStr= digit.substring(i, i+1);
 			arr[i]= Integer.parseInt(digitStr);
 		}
 		System.out.println(Arrays.toString(arr));
 		System.out.println('\n');

 		int counter1= 0;
 		int counter2= 0;
 		int counter0= 0;

 		for(int x: arr){
 			if(x%3==1){
 				counter1++;
 			}else if(x%3==2){
 				counter2++;
 			}else if(x%3==0){
				counter0++;
			}
 		}

 		int[] arr1= new int[counter1];
 		int[] arr2= new int[counter2];
 		int[] arr0= new int[counter0];

 		int k=0;
 		int l=0;
 		int m=0;
 		for(int x: arr){
 			if(x%3==1){
 				arr1[k]=x;
 				k++;
 			}else if(x%3==2){
 				arr2[l]=x;
 				l++;
 			}else if(x%3==0){
				arr0[m]=x;
				m++;
			}
 		}
 		for(int x:arr1){
 			System.out.print(x);
 			System.out.print(" ");
 		}
 		System.out.println('\n');

 		for(int x:arr2){
 			System.out.print(" ");
 			System.out.print(x);
 		}
 		System.out.println('\n');
		System.out.print(" ");
 		for(int x:arr0){
		 	System.out.print(" ");
		 	System.out.print(x);
		 }
 		System.out.println('\n');


 	}
 }
