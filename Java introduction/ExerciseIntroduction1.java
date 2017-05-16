
public class ExerciseIntroduction1 {
	/* Write a program that produces the following output:
000000001
000000022
000000333
000004444
000055555
000666666
007777777
088888888
999999999
*/
	public static void main(String []Args){


		int[] ar={0, 0, 0, 0, 0, 0, 0, 0, 1};
		System.out.println(ar[0]+", "+ar[1]+", "+ar[2]+", "+ar[3]+", "+ar[4]+", "+ar[5]+", "+ar[6]+", "+ar[7]+", "+ar[8]);



		for(int j=2; j<=ar.length; j++){
			for(int i=ar.length-1; i>=ar.length-j; i--){
				ar[i]=j;
			}

			System.out.println(ar[0]+", "+ar[1]+", "+ar[2]+", "+ar[3]+", "+ar[4]+", "+ar[5]+", "+ar[6]+", "+ar[7]+", "+ar[8]);
		}
	}

}
