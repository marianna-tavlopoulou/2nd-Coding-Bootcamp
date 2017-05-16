import java.util.Scanner; //απαραιτητο για να γινει το compile
public class ExerciseIntroduction2 {  //ονομα κλασης ιδιο με ονομα αποθηκευσης

	/*Write a program that asks the user to provide different numbers of banknotes and coins, from €50 to €1. Then output the total sum in euros. For example:
Enter number of 50 euro banknotes: 10
Enter number of 20 euro banknotes: 20
Enter number of 10 euro banknotes: 30
Enter number of 5 euro banknotes: 40
Enter number of 2 euro coins: 50
Enter number 1 euro coints: 60
You have 1560 euros.
*/
public static void main (String args []){
	System.out.println("Enter number of 50 euro banknotes:"); //λεω να εκτυπωσει 50euro
	Scanner mitsos= new Scanner (System.in);// αυτη η γραμμη υλοποιειται για να μπορω να καλεσω το μητσο απο την κλαση Scanner. Φτιαχνω το αντικειμενο μητσο. λεω στην πρωτη γραμμη να φερει την κλαση Scanner
	int penintaEura=mitsos.nextInt();/* αριστερα: λεω int και ονομα μεταβλητης = ονομαΑντικειμενου.η εντολη να βαλει πεδιο για input(μια γραμμη που θα αναβοσβηνει).τι τυπο να περιμενει
		ονομα κλασης ονομα αντικειμενου = new όνομα ()*/
	System.out.println("Enter number of 50 euro banknotes:" + penintaEura);//εδω εκτυπωνει τη συνενωση του 50eura και του ονοματος της μεταβλητης
		//ο mitsos χρησιμευει μονο και μονο για να καλεσω το next.Int, θα τον ξαναχρησιμοποιησω και για τα 20eura

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