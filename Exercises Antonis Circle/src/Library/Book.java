package Library;
//--------------------------------------------------------------------------------
public class Book {

//--------------------------------------------------------------------------------


	
	
	




private Author author;
final String  isbn;
private int physicalCopies;
private int availableCopies;
private int timesRented;
	
//dilosi metavliton-------------------------------------------------------------







public String getIsbn() {return isbn;}
public String getTitle() {return title;}
public Author getAuthor() {return author;}
public int getphysicalCopies() {return physicalCopies;}
public int getAvailableCopies() {return availableCopies;}
public int getTimesRented() {return timesRented;}
//geters-------------------------------------------------------------------------------------------------------









public void setTitle(String title) {this.title = title;}
public void setAuthor(Author author) {this.author= author;}
public void setPhsicalCopies(int physicalCopies) {this.physicalCopies = physicalCopies;}
public void setAvailableCopies(int availableCopies) {this.availableCopies = availableCopies;}
public void setTimesRented(int timesRented) {this.timesRented = timesRented;}
//seters--------------------------------------------------------------------------------




public Book(String title, Author author, String isbn, int physicalCopies, int availableCopies, int timesRented) {
	
	this.title = title;
	this.author= author;
	this.isbn = isbn;
	this.physicalCopies = physicalCopies;
	this.availableCopies = availableCopies;
	this.timesRented = timesRented;
	
}	
//arxikopoihsh timon constructor--------------------------------------------------------------------------------------------	


private	String title;	
@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author.toString() + ", isbn=" + isbn + ", physicalCopies=" + physicalCopies
			+ ", availableCopies=" + availableCopies + ", timesRented=" + timesRented + "]";
}
//toString-pernei times apo getName()  toy Author---------------------------------------------------------------------------





//methodoi+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//11111111111111111111111111111111111111
public void rentPhysicalCopy(){
	if (physicalCopies!=0){
		System.out.println("Yparxei !!");
	} else{
		System.out.println("Oh!!! Den yparxei!!");}
}
//Checks if there is an available copy for renting. If yes, then it prints a message of success. ----------------------------
//What fields should be modified upon a successful rental?--------------------------------------------------------------------





//2222222222222222222222222222222222222222
public boolean isAvailable()
	{if (availableCopies!=0){return true;}
		else{return false;}
}
//return type boolean. Checks if there is at least one available physical copy of the book




//333333333333333333333333333333333333333333333333333333333
public boolean hasAuthor(String checkAuthor)
{ Author check=this.author;
  boolean a = (check.toString().equals(checkAuthor));
   return a;
	 }

//return type boolean. Checks if a given name is the name of this book's author---------------------------------------------------------

//methodoi------------------------------------------------------------------------------------------------------------------

}



