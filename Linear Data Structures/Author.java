/* Class Author
Fields:
name, of type String
Methods:
toString, return type String, returns the name of the author */

public class Author{

	//fields
	private String name;

	//constructor
	Author(String name){
		this.name= name;
	}

	//Getters & Setters
	public String getAuthorName(){
		return this.name;
	}
	public void setAuthorName(String name){
		this.name= name;
	}
	//method
	public String toString(){
		return getAuthorName();
	}

}