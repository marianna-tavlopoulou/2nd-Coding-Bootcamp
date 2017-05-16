import java.util.ArrayList;
import java.util.Date;

public class TransactionHistory {

//fields
	private Transaction trans;
	private Book book;
	private static ArrayList<Transaction> transHistory;
	private Date dateServe;
	
//Getters& Setters
	public Transaction getTrans() {
		return trans;
	}
	public void setTrans(Transaction trans) {
		this.trans = trans;
	}
	public ArrayList<Transaction> getTransHistory() {
		return transHistory;
	}
	public void setTransHistory(ArrayList<Transaction> transHistory) {
		this.transHistory = transHistory;
	} 
	
//constructor
	public TransactionHistory() {
		transHistory=new ArrayList<Transaction>();
	}
	
//methods
	
	
	
	//add transaction to rented, remove from pending
public void add(Transaction trans) {
		transHistory.add(trans);
	}

//print transaction history
		public void printTransactionHistory(){
			System.out.println("history");
			for(int i=0; i<transHistory.size(); i++){
				System.out.println(transHistory.get(i).toString());
			}
		}
	
}
