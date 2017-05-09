
package Library;
public class Library {

//------------------------------------------------------------------------------------------------------

	
	
	
	
public Book[] books;//books, type Book[] (array of Books)There is a Library that has a collection (single dimension array) of Books
//dilosi metavliton-------------------------------------------------------------------------------------



public Library(Book[] books) {
	this.books = books;
}




//methodoi+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
public void printAvailableBooks(){
	for (Book giakathe:books){
		if(giakathe.isAvailable()){
		System.out.println(giakathe);} 
	}
}
//Prints books that have at least one available physical copy. Hint: Use the isAvailable and the toString methods from the Book class









//2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222
public void printBookDetails(String titlos){// o titlos dinete apo ton user kai ton dexete h methodos printBookDetails()
	boolean flag = false;
	for (Book giakathe:books){
		if(giakathe.getTitle().equals(titlos)){
			System.out.println(giakathe.toString());
			flag=true;
		}
	}
	if (flag==false){
		System.out.println("error den vrethike vivlio");}
}
// Searches for a book based on a given title. If the book exists then its details should be printed, otherwise an error message should be displayed)-------------------------------------------------------------------






//33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333
public void printBooksFromAuthor(String onomaAuthor){// to onomaAuthor to dinei o user------------------------------------------------
	boolean flag=false;
		for(Book giakathe:books){
		if(giakathe.hasAuthor(onomaAuthor)){
			System.out.println(giakathe);
			flag=true;
		}
	}
		if (flag==false){
			System.out.println("none");
		}
}
//Prints only the books that have an author that matches a given name---------------------------------------------------------------------------------------	






//4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444
public void printTheMostPopularBook() {
	int maxrent=0;
	int position=0;
	for ( int i =0;i<books.length;i++){
		if(books[i].getTimesRented()>maxrent){
			maxrent=books[i].getTimesRented();
			position=i;
		}
	}
	System.out.println(books[position].toString());
}
//Prints the book with the highest number of the timesRented field-------------------------------------------





}//TELOS CLASS LIBRARY


    
	
    