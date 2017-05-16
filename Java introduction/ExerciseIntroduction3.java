import java.util.Scanner;
public class ExerciseIntroduction3 {
	public static void main (String[] args){
		/* A quadratic equation is an equation of the form:  �x2 + �x +�=0
			The roots of a quadratic equation are given by the formula:

Note that if  , then no real-valued solutions exist. Write a program that asks the user to enter values for a, b ,c,
then prints the solutions of the quadratic equation they define, if they exist. If they do not exist,
it should output an appropriate message.
*/
		Scanner timi=new Scanner(System.in);

			System.out.println("�������� ���� ��� �� a:");
			int a= timi.nextInt();
			System.out.println("�������� ���� ��� �� b:");
			int b=timi.nextInt();
			System.out.println("�������� ���� ��� �� c:");
			int c=timi.nextInt();
			int dd=b*b-4*a*c;
			double d= Math.sqrt(dd);
			double dab=Math.abs(d);

			if(dd==0){
				double x1=-b/(2*a);
				double x2=b/(2*a);
				System.out.println("�� ����������� ������ ��� �������� �����: x1="+x1+" ��� x2="+x2);
			}else if(dd>0){
				double x1=(-b+d)/(2*a);
				double x2=(-b-d)/(2*a);
				System.out.println("�� ����������� ������ ��� �������� �����: x1="+x1+" ��� x2="+x2);
			}else{
				System.out.println("H ������� ��� ���� ����������� ������.");
			}


	}


}