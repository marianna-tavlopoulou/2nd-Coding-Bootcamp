import java.util.ArrayList;
import java.util.Arrays;

public class AuthorList {
	
//fields
	ArrayList<Author> authorList= new ArrayList<Author>();
	
//constructor
	AuthorList(Author[] authorsArray){
		this.authorList.addAll(Arrays.asList(authorsArray));
	}
	
//methods
	//add author
	public void addAuthor(Author author){
		for(int i=0; i<authorList.size(); i++){
			if(author.getAuthorName().equals(authorList.get(i).getAuthorName())){
				authorList.add(author);
			}
		}
	}
	
	//check if author exists
	public boolean authorExists(String nameToCheck){
		int temp= 0;
		for(Author x:authorList){
			if(x.toString().equals(nameToCheck)){
				temp=1;
			}
		}
		if(temp==1){
			return true;
		}else{
			return false;
		}
	}
	
	//a toString method that returns a String with all names
	public String toString(){
		return "Authors: "+'\n'+authorList;
	}
	
}
