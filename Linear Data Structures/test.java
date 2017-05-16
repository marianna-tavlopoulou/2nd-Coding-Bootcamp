import java.util.Scanner;
public class test {
public static void main(String[] Args){
	User user1 = new User("Koula");
	User user2 = new User("Takis");
	User user3 = new User("Martha");
	User user4 = new User("Nikos");
	User user5 = new User("Sarah");
		
	UserList users = new UserList();
	users.addUser(user1);
	users.addUser(user2);
	users.addUser(user3);
	users.addUser(user4);
	users.addUser(user5);
	
	users.printAllUsers();
																	
	System.out.println(user1.toString());
	
	System.out.println("Search result: "+users.userExists("Koula"));
	System.out.println("Search result: "+users.userExists("Takis"));
	System.out.println("Search result: "+users.userExists("Martha"));
	System.out.println("Search result: "+users.userExists("Nikos"));
	System.out.println("Search result: "+users.userExists("Sarah"));
	System.out.println("Search result: "+users.userExists("Soulis"));
	System.out.println("Search result: "+users.userExists("opo"));

	Scanner scan = new Scanner(System.in);
	
	/*System.out.println("New user:\n Insert name");
	String inputName = scan.nextLine();
	*/
}
}
