import java.util.LinkedList;

public class BookList {
	
//field
	private LinkedList<Book> bookList= new LinkedList<Book>();
	
//constructor
	BookList(Book[] books){
		for(int i=0; i<books.length; i++){
		this.bookList.add(books[i]);
		}
	}
	
	
	
//methods
	
	//exists(String title) - returns true or false if the book exists in the list
	public boolean exists(String givenTitle){
		int temp=0;
		for(int i=0; i<bookList.size(); i++){
			if(bookList.get(i).getTitle().equals(givenTitle)){		//Look how bookList.get(i) works! It gives me the book element I need to compare with the given title with index i
				temp=1;
			}else{
				temp=0;
			}
		}
		if(temp==0){
			return true;
		}else{
			return false;
		}
	}

	//give me book with a given title
	public Book findBook(String givenTitle){
		for(Book x:bookList){
			if(x.getTitle().equals(givenTitle)){
				return x;
			}
		}
		return null;
	}
	
	//add book(Book newBook) - adds a new book at the end of the list (only if the book doesn't exist)
	public void addBook(Book newBook){
		if(!exists(newBook.getTitle())==true){
			bookList.add(newBook);
		}
	}	
	
	//remove book - removes a book with a given title, if exists
	public void removeBook(String givenTitle){
		if(exists(givenTitle)==true){
			for(int i=0; i<bookList.size(); i++){
				if(bookList.get(i).getTitle().equals(givenTitle)){	
					bookList.remove(bookList.get(i));
				}
			}
		}
	}
	
	//printAvailableBooks
	public void printAvailableBooks(){
		int x=1;
		for(int i=0; i<bookList.size(); i++){
			if(bookList.get(i).isAvailable()==true){	
				System.out.println(bookList.get(i).toString());
				System.out.print("\n");
				x=1;
			}
		}
		if(x==0){
			System.out.println("There are no available books right now...");
		}
		System.out.print("-----------------------------------------------------------------------");
		System.out.print("\n");
	}
	
	//printBookDetails
	public void printBookDetails(String givenTitle){
		int a= 0;
		for(int i=0; i<bookList.size(); i++){
			if(bookList.get(i).getTitle().equals(givenTitle)){
				System.out.println(bookList.get(i).toString());	
				System.out.print("\n");
				a=0;
				break;
			}else{
				a=1;
			}
		}
		if(a==1){
			System.out.println("Title not found...");
		}
		System.out.print("-----------------------------------------------------------------------");
		System.out.print("\n");
	}
	
	//printBooksFromAuthor
	public void printBooksFromAuthor(String nameToCheck){
		int x=1;
		for(int i=0; i<bookList.size(); i++){
			if(bookList.get(i).hasAuthor(nameToCheck)==true){
				System.out.println(bookList.get(i).toString());
				System.out.print("\n");
				x=0;
			}
		}
		if(x!=0){
			System.out.println("Nothing written by this author was found.. ");
		}
		System.out.print("-----------------------------------------------------------------------");
		System.out.print("\n");

	}
	//print book's availability
	public void printBookAvailability(String givenTitle){
		boolean k=true;
		for(Book x:bookList){
			if(x.bookIsAvailable(givenTitle)==true){
				System.out.println("The book you requested is available. Would you like to rent it?");
			}else{
				k=false;
			}
		}
		if(k==false){
			System.out.println("The book you requested is not available at the moment. You could search for another one.");
		}
		System.out.print("-----------------------------------------------------------------------");
		System.out.print("\n");
	}
	
	//printTheMostPopularBook
	public void printTheMostPopularBook(){	
		int max=bookList.get(0).getTimesRented();	
		for(int i=0; i<bookList.size(); i++){

			if(bookList.get(i).getTimesRented()>max){
				max=bookList.get(i).getTimesRented();
			}
		}
		for(int i=0; i<bookList.size(); i++){
			if(max==bookList.get(i).getTimesRented()){
			System.out.println(bookList.get(i).toString());
			System.out.print("\n");
			}
		}
		System.out.print("-----------------------------------------------------------------------");
		System.out.print("\n");

	}
	
	
}
