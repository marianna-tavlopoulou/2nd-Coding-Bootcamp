import java.util.LinkedList;

/* Create a TransactionQueue class that serves as a Queue data structure for storing Transactions that are pending to be executed. 
The TransactionQueue should be implemented by a data-structure of your preference (simple arrays, ArrayList, Linked-list) but should provide only the methods of a Queue
An instance variable of type TransactionQueue should be introduced in your Librarian class since a librarian is responsible for serving the requests
Every time that a book is requested, a Transaction should be created and stored in the Queue.  */
public class TransactionQueue {
	
//fields
	private Transaction trans;
	public static LinkedList<Transaction> transQueue;
//constructor
	TransactionQueue(){
		transQueue=new LinkedList<Transaction>();
	}	
	
//Getters & Setters
	public Transaction getTrans() {
		return trans;
	}

	public void setTrans(Transaction trans) {
		this.setTrans(trans);
	}

	public LinkedList<Transaction> getTransQueue() {
		return transQueue;
	}

//methods
	//add transaction at the end of the queue
	public void addTrans(Transaction trans){
			transQueue.add(trans);
	}
	//Show transaction: returns without removing the first element of the queue
	public Transaction showTrans(){
		return transQueue.get(0);
		
	}
	
	//Remove transaction: removes and returns the first element of the queue
	public void removeTrans(){
		if(!transQueue.isEmpty())
		transQueue.poll();
	}
	
	//print all pending transactions
			public void printPendingTransactions(){
				for(int i=0; i<transQueue.size(); i++){
					System.out.println(transQueue.get(i).toString());
				}
			}
			
	//listSize
			public void listSize(){
				transQueue.size();
			}

			public boolean isEmpty() {
				transQueue.isEmpty();
				return false;
			}
			
			
	
}	