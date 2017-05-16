/*  The Greek Tax Identification Number (TIN) consists of 9 digits. The last digit is a check digit. It is calculated as follows:
	We remove the check digit, so that we are left with an 8-digit number.
	We take the 8 digits one by one, from the right to the left. We multiply each digit by the power of 2 corresponding to its position:
	the first from the right will be multiplied by 2^1, the second will be multiplied by2^2, and so on.
	We take these powers and we sum them.
	We calculate the remainder of this sum by 11.
	We take this remainder and we calculate its remainder by 10. The result must equal the check digit.  */


import java.lang.*;
import java.util.Scanner;
public class ExerciseIntroduction6{
	public static void main(String[] Args){

		Scanner scan = new Scanner(System.in);
		/* πως να δηλωσω τις μεταβλητες ετσι ωστε ο χρηστης να μην τις βαζει μια μια και εντερ??? */

		System.out.println("Enter Tax Identification Number: ");
		String tinString= scan.nextLine();

		double[] tinArr= new double[9];
		double[] tinArrP= new double[9];

		for(int i=0; i<9; i++){
			String tinSubString= tinString.substring(i,i+1);
			tinArr[i]= Integer.parseInt(tinSubString);
			}
		double sum= 0;
		for(int i=0; i<8; i++){
			tinArrP[i]=tinArr[i]* Math.pow(2, tinArr.length-1-i);
			sum += tinArrP[i];
		}
		double check= (sum%11)%10;

		if(check==tinArr[8]){
			System.out.println("Tax Identification Number valid.");
		}else{
			System.out.println("Tax Identification Number not valid.");
		}

	}
}