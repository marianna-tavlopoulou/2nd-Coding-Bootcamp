import java.util.Date;

/* Class Library
Fields:
books, type Book[] (array of Books)
Methods: */
public class Library{

//fields	
	private BookList bookList;
	private TransactionHistory transHistory;
	private TransactionQueue transQueue= new TransactionQueue();
	
//constructor
	Library(BookList bookList){
		this.bookList= bookList;
		
	}
	
//Getters
	public BookList getBookList() {	//getter is needed so that
		return bookList;
	}
	
	public TransactionQueue getTransQueue(){
		return this.transQueue;
	}
	
//methods
	public void findMeBooksFromAuthor(String nameToCheck){
		bookList.printBooksFromAuthor(nameToCheck);
	}
	
	//findMeAvailableBooks, type void. Delegates the request to the bookList's printAvailableBooks method 
	public void findMeAvailableBooks(){
		bookList.printAvailableBooks();
	}

	//findMeBook, type void. Receives a book's title and delegates the request to the bookList's printBookDetails method 
	public void findMeBook(String titleToCheck){
		bookList.printBookDetails(titleToCheck);
	}

	//findMostPopularBook, type void. Delegates the request to the bookList's printTheMostPopularBook method 
	public void findMostPopularBook(){
		bookList.printTheMostPopularBook();
	}
		
	//printBookDetails
	public void printBookDetails(String givenTitle){
		bookList.printBookDetails(givenTitle);
	}
	//request a book
		public void bookRequest(String givenTitle){
			bookList.printBookAvailability(givenTitle);
		}
		
	/*Give the Librarian the ability to perform the rentPhysicalCopy functionality. The librarian should retrieve the book (through the Library),
	 create the necessary transaction and store it to his pending queue.*/
		public void rentPhysicalCopy(String givenTitle){
			if(bookList.findBook(givenTitle)!=null && bookList.findBook(givenTitle).isAvailable()==true){
				int a= this.bookList.findBook(givenTitle).getAvailableCopies();
				this.bookList.findBook(givenTitle).setAvailableCopies(a-1);
				int b=this.bookList.findBook(givenTitle).getTimesRented();
				this.bookList.findBook(givenTitle).setTimesRented(b+1);
				Date dateReq = new Date();
				Transaction trans= new Transaction(bookList.findBook(givenTitle));
				transQueue.addTrans(trans);
				System.out.println("Your transaction is pending..");
			}	
		}
		 
}