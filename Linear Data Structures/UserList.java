
/* Create a class UserList, which stores User objects
UserList should behave as a linked-list with elements of type User. (It should hold only the "head" of the list)
UserList should offer the following functionalities:
search for a user
add a user (if he doesn't exist)
remove a user
print all users */
public class UserList {

	//fields 
	//private User user= new User(" ");
	private User firstElement;
	
	//constructor
	UserList( ){
		this.firstElement= null;
	}

	//Getters & Setters
	/*public static LinkedList<User> getUserList() {
		return userList;
	}*/
	
	

	
	//Methods
	
	//return a user for a given name
	/*public User userSearch(String givenName){
		for(User x:userList){
			if(x.getName().equals(givenName)){
				return x;
			}
		}
		return null;
	}
	*/
	
	//add a user in the list
	public void addUser(User user){
		if(this.firstElement == null){
			this.firstElement = user; 
		}else{
			User currentUser=this.firstElement;
			while(currentUser.getNext() != null){
				currentUser = currentUser.getNext();
			}
			currentUser.setNext(user);
		}
	}
	

	
	//user exists
	/*public boolean userExists(String givenName){
		User currentUser = this.firstElement;
        boolean is_found = false;
        if(currentUser != null){
			if(currentUser.getName().equals(givenName)){
				is_found = true;
			}else{
				while(currentUser.getNext() != null){
					if(currentUser.getName().equals(givenName)){
						is_found = true;
						break;
					}
					currentUser = currentUser.getNext();
				}
			}
		} else {
			is_found = false;
		}
		if(is_found == true){
			return true;
		}else{
			return false;
		}
	}*/
	
	//alternative exists
	public boolean userExists(String givenName){
		User currentUser = this.firstElement;
        if(this.firstElement == null){
			return false;
		}
		while(!currentUser.getName().equals(givenName) && currentUser.getNext() != null){
			currentUser = currentUser.getNext();
		}
		{
			if(currentUser.getName().equals(givenName)){
				return true;
			}else{
				return false;
			}
		}
	}
	
	//remove a user
	public void removeUser(String givenName){
		if(userExists(givenName)){
			
				
				
			
		}
	}

		
	public void printAllUsers(){
		System.out.println("User List: " );
		User currentUser = this.firstElement;
		if(this.firstElement != null){
			while(currentUser.getNext() != null){
				System.out.print( currentUser.toString()+", "); 
				currentUser = currentUser.getNext();
			}
			System.out.println(currentUser.toString());
		}else{
			System.out.println("The user list is empty. ");
		}
	}
}
