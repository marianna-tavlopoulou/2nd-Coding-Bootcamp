/* A simple way to check binary data is the so-called parity bit. A byte consists of 8 bits, so that we can use the last bit to check
whether the previous 7 are OK. We can do that by checking that the sum of the 1 bits is an even number (this is actually called even
parity; we might require that the sum of 1 bits is odd, which is called odd parity). For example, see the following table where we see
the first 7 bits of some numbers, the number of 1 bits in them, the full 8-bit number (including the parity) and the number of 1 bits
in the byte.
First 7 bits	Number of 1s	8 bits (with parity)	Number of 1s
0000000	0	00000000	0
1010001	3	10100011	4
1101001	4	11010010	4
1111111	7	11111111	8
Write a program that asks the user for an 8-bit binary number and replies whether the parity bit checks OK.
For example:
Enter binary number: 01010101
Parity check OK.

Enter binary number: 11010101
Parity check not OK. */

import java.util.Scanner;
import java.util.Arrays;
public class ExerciseIntroduction7{
	public static void main(String[] Args1){
		Scanner ska=new Scanner(System.in);

		System.out.println("Enter binary number: ");
		String binary= ska.nextLine();

		int[] arr= new int[8];
		int sum=0;

		for(int i=0; i<8; i++){
			String binaryString= binary.substring(i, i+1);
			arr[i]= Integer.parseInt(binaryString);
			sum+=arr[i];
		}

		if(sum%2==0){
			System.out.println("Parity check OK.");
		}else{
			System.out.println("Parity check not OK.");
		}




	}
}