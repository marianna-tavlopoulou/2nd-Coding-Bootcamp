import java.util.Date;

/* Create a class named Transaction that stores information related to the "renting a book", operation.*/

public class Transaction {

//fields
	private Book book;
	private Date dateReq;
	private Date dateServe;
	private static int count=0;
	private final int idTransaction;
	
//constructor
	Transaction(Book book){
		count++;
		this.idTransaction= count;
		this.book= book;
		this.dateReq = new Date();
	}
	
//Getters & Setters
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Date getDateReq() {
		return dateReq;
	}

	public void setDateRequest(Date dateReq) {
		this.dateReq = dateReq;
	}

	public Date getDateServe() {
		return dateServe;
	}

	public void setDateServe(Date dateServe) {
		this.dateServe = dateServe;
	}

	public static int getCount() {
		return count;
	}

	public int getIdTransaction() {
		return idTransaction;
	}
	
//methods
	//toString
	public String toString(){
		return "Transaction's details: idTransaction: "+getIdTransaction()+", Book: "+ book.toString()+ ", request date: "+getDateReq();
		
	}
	


}

