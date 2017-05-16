/*
transactions - a TransactionsHistory that stores all Transactions related to the current user*/

public class User {

	//fields
	private String name;
	private final int userId;
	private static int count = 0;
	private User next;
	private Transaction trans;
	
	//constructor
	User(String name){
		this.next=null;
		count++;
		this.userId = count;
		this.name = name;
	}

	//getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getNext() {
		return this.next;
	}

	public void setNext(User user) {
		this.next = user;
	}

	public Transaction getTrans() {
		return trans;
	}

	public void setTrans(Transaction trans) {
		this.trans = trans;
	}

	public int getUserId() {
		return userId;
	}
	
	//methods
	
	public String toString(){
		return this.name;
	}
	
}
