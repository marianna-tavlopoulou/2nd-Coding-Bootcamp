import java.util.Date;
import java.util.Scanner;

public class Librarian{
	
//fields
	private Library library;
	private TransactionQueue transQueue= new TransactionQueue();
	private TransactionHistory transHistory= new TransactionHistory();
	private Transaction trans;
	private BookList bookList;
	
//getters & setters
	public Library getLibrary(){
		return this.library;
	}

//constructor
	Librarian(Library library){
		this.library= library;
		this.bookList = this.library.getBookList();		
	}

	//methods
	
//execute all pending transactions
	public void executePending(){
		//System.out.println();
		if(!library.getTransQueue().getTransQueue().isEmpty()){
			for(Transaction x:library.getTransQueue().getTransQueue()){
				Date dateServed= new Date();
				x.setDateServe(dateServed);
				transHistory.add(x);
				transQueue.removeTrans();
				System.out.println("The book has been rented!");				
			}
		}else{
			System.out.println("There are not pending transactions.");
		}
	}

	
// findMeBooksFromAuthor, type void. Receives an author name and delegates the request to the library's printBooksFromAuthor method 
	public void findMeBooksFromAuthor(String nameToCheck){
		library.findMeBooksFromAuthor(nameToCheck);
	}

// findMeAvailableBooks, type void. Delegates the request to the library's printAvailableBooks method 
	public void findMeAvailableBooks(){
		library.findMeAvailableBooks();
	}
 
// findMeBook, type void. Receives a book's title and delegates the request to the library's printBookDetails method 
	public void findMeBook(String titleToCheck){
		library.printBookDetails(titleToCheck);
	}

// findMostPopularBook, type void. Delegates the request to the library's printTheMostPopularBook method 
	public void findMostPopularBook(){
		library.findMostPopularBook();
	}
	
//request a book
	public void bookRequest(String givenTitle){
		library.bookRequest(givenTitle);
		transQueue.addTrans(trans);
	}
	
//print all pending transactions
		public void printRequests(){
			transQueue.printPendingTransactions();
		}
		
//print all transactions
		public void showMeTransactions(){
			transQueue.printPendingTransactions();
			transHistory.printTransactionHistory();
		}
		
/*rentPhysicalCopy functionality. The librarian should retrieve the book (through the Library), create the necessary transaction and store it to his pending queue. */
		public void rentPhysicalCopy(String givenTitle){
			library.rentPhysicalCopy(givenTitle);
		}

//print transaction history
		public void printTransactionHistory(){
			transHistory.printTransactionHistory();

		}

//show options to the user
		public void showOptions(){
			Scanner scan= new Scanner(System.in);
			String choose =  "";
			System.out.println("\n\n Welcome to the Bootcamp library.\n ");
			while(!choose.equals("q")){
				System.out.println(" How do you want to proceed?\n");
				System.out.println("1. Show all available books");
				System.out.println("2. Search for a book (by book title)");
				System.out.println("3. Display books from a specific author");
				System.out.println("4. Find the most popular book");
				System.out.println("5. Add book");
				System.out.println("6. Remove book");
				System.out.println("7. Execute Transactions");
				System.out.println("q. Quit");
				
				choose= scan.nextLine();
	
				switch(choose){
					case "1":
						findMeAvailableBooks();
						break;
					case "2":
						System.out.println("Which title are you searching for? ");
						String titleToCheck= scan.nextLine();
						findMeBook(titleToCheck);
						break;
					case "3":
						System.out.println("Which author are you searching for? ");
						String nameToCheck= scan.nextLine();
						findMeBooksFromAuthor(nameToCheck);
						break;
					case "4":
						findMostPopularBook();
						break;
					case "5":
						System.out.println("Book's title:  ");
						String inputParametersTitle= scan.nextLine();
						/*if(bookList.exists(inputParametersTitle)){
							System.out.println("The book already exists.");
						}*/
						System.out.println("Book's authors: How many are they? ");
						int inputParametersAuthorsNum= scan.nextInt();
						scan.nextLine(); //sometimes java gets confused when you ask for an int input and after that you ask for a string input. In this case this command resolves the problem!!!
						System.out.println("Book's authors: What are their names? ");
						String inputParametersAuthors= scan.nextLine();
						String[] parts = inputParametersAuthors.split(",");
						Author[] authorsOf= new Author[inputParametersAuthorsNum];
						int i=0;
						for(String x:parts){
						authorsOf[i] = new Author(x);
						//setAuthorName(x);
							i++;
						}	
						System.out.println(authorsOf);
						System.out.println("Book's Isbn:  ");
						String inputParametersIsbn= scan.nextLine();
						System.out.println("Book's physical copies:  ");
						int inputParametersPhysCopies= scan.nextInt();
						System.out.println("Book's available copies:  ");
						int inputParametersAvailCopies= scan.nextInt();
						System.out.println("How many times has the book been rented?  ");
						int inputParametersTimesRent= scan.nextInt();
						
						Book newBook= new Book(inputParametersTitle, authorsOf, inputParametersIsbn, inputParametersPhysCopies, inputParametersAvailCopies, inputParametersTimesRent);
						bookList.addBook(newBook);
						System.out.println(newBook.toString());
						break;
					case "6":
						System.out.println("Which book would you like to remove?");
						String inputBookTitle= scan.nextLine();
						//System.out.println(bookList.toString());
						if(bookList.exists(inputBookTitle)){
							bookList.removeBook(inputBookTitle);
						}else{
							System.out.println("The book does not exist.");
						}
						System.out.println("The book has been removed.");
						break;
					case "7":
						executePending();
						break;
					case "q":
						System.out.println("Goodbye!");
						break;
					default:
						System.out.println("Try again.");
						break;
	
				}
			}
		}
}