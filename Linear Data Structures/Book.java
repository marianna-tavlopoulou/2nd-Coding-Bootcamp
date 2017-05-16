
public class Book{

//fields
	private AuthorList authorList;
	private String title;
	//private Author author;
	private final String isbn;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;
	private Book book;

//Constructor 
	Book(String title, Author[] authorsOf, String isbn, int physicalCopies, int availableCopies, int timesRented){
		this.title= title;
		this.authorList= new AuthorList(authorsOf);
		this.isbn= isbn;
		this.physicalCopies= physicalCopies;
		this.availableCopies= availableCopies;
		this.timesRented= timesRented;
	}

// Methods


	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title= title;
	}
		
	public String getIsbn(){
		return this.isbn;
	}
	public int getPhysicalCopies(){
		return this.physicalCopies;
	}
	public void setPhysicalCopies(int physicalCopies){
		this.physicalCopies= physicalCopies;
	}
	public int getAvailableCopies(){
		return this.availableCopies;
	}
	public void setAvailableCopies(int availableCopies){
		this.availableCopies= availableCopies;
	}
	public int getTimesRented(){
		return this.timesRented;
	}
	public void setTimesRented(int timesRented){
		this.timesRented= timesRented;
	}
/* toString, return type String. Returns the details of the book including the Author details. The Authors' details should be acquired
by the proper toString method */
	public String toString(){
		return "Book's details: "+getIsbn()+", "+getTitle()+", written by "+this.authorList.toString()+", physical copies: "+getPhysicalCopies()+", available copies: "+getAvailableCopies()+", rented "+getTimesRented()+" times.";
	}

/* rentPhysicalCopy, type void. Checks if there is an available copy for renting. If yes, then it prints a message of success. What
fields should be modified upon a successful rental?   ------availableCopies, timesRented------ */
	
	public void rentPhysicalCopy(String givenTitle){
		if(getAvailableCopies()>0){
			System.out.println("There is an available copy for renting!");
		}else{
			System.out.println("Unfortunately there is no available copy for renting...");
		}
	}
	
// isAvailable, return type boolean. Checks if there is at least one available physical copy of the book 

	public boolean isAvailable(){
		if(getAvailableCopies()>0){
			return true;
		}else{
			return false;
		}
	}

//ask for the availability of a specific book
	public boolean bookIsAvailable(String givenTitle){
		if(book.title.equals(givenTitle)==true){
			return true;
		}else{ return false;
		}
	}
	
	
//hasAuthor, return type boolean. Checks if a given name is the name of this book's author */

	public boolean hasAuthor(String nameToCheck){
		if(authorList.authorExists(nameToCheck)){
			return true;
		}else{
			return false;
		}
	}	

		/* == tests for reference equality (whether they are the same object).

.equals() tests for value equality (whether they are logically "equal").

Objects.equals() checks for nulls before calling .equals() so you don't have to (available as of JDK7, also available in Guava).

Consequently, if you want to test whether two strings have the same value you will probably want to use Objects.equals() */
}