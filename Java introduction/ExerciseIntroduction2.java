import java.util.Scanner; //���������� ��� �� ����� �� compile
public class ExerciseIntroduction2 {  //����� ������ ���� �� ����� �����������

	/*Write a program that asks the user to provide different numbers of banknotes and coins, from �50 to �1. Then output the total sum in euros. For example:
Enter number of 50 euro banknotes: 10
Enter number of 20 euro banknotes: 20
Enter number of 10 euro banknotes: 30
Enter number of 5 euro banknotes: 40
Enter number of 2 euro coins: 50
Enter number 1 euro coints: 60
You have 1560 euros.
*/
public static void main (String args []){
	System.out.println("Enter number of 50 euro banknotes:"); //��� �� ��������� 50euro
	Scanner mitsos= new Scanner (System.in);// ���� � ������ ����������� ��� �� ����� �� ������ �� ����� ��� ��� ����� Scanner. ������� �� ����������� �����. ��� ���� ����� ������ �� ����� ��� ����� Scanner
	int penintaEura=mitsos.nextInt();/* ��������: ��� int ��� ����� ���������� = �����������������.� ������ �� ����� ����� ��� input(��� ������ ��� �� �����������).�� ���� �� ���������
		����� ������ ����� ������������ = new ����� ()*/
	System.out.println("Enter number of 50 euro banknotes:" + penintaEura);//��� ��������� �� �������� ��� 50eura ��� ��� �������� ��� ����������
		//� mitsos ���������� ���� ��� ���� ��� �� ������ �� next.Int, �� ��� ����������������� ��� ��� �� 20eura

	System.out.println("Enter number of 20 euro banknotes:");
	int eikosaEura=mitsos.nextInt();
	System.out.println("Enter number of 20 euro banknotes:" + eikosaEura);

	System.out.println("Enter number of 10 euro banknotes:");
	int dekaEura= mitsos.nextInt();
	System.out.println("Enter number of 10 euro banknotes:" + dekaEura);

	System.out.println("Enter number of 5 euro banknotes:");
	int pentaEura=mitsos.nextInt();
	System.out.println("Enter number of 5 euro banknotes:" + pentaEura);

	System.out.println("Enter number of 2 euro banknotes:");
	int diEura= mitsos.nextInt();
	System.out.println("Enter number of 2 euro banknotes:" + diEura);

	System.out.println("Enter number of 1 euro banknotes:");
	int monoEura= mitsos.nextInt();
	System.out.println("Enter number of 1 euro banknotes:" + monoEura);

	int synolo= 50* penintaEura + 20* eikosaEura + 10* dekaEura + 5* pentaEura + 2* diEura + 1* monoEura;

	System.out.println("You have "+synolo+ " euros");


	}


}