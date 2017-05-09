package Library;


public class Librarian {
//----------------------------------------------------------------------------------
	

private Library library;
//dilosi metavliton-------------------------------------------------------------	
	
	
	
	
public Library getLibrary() {return library;}
public void setLibrary(Library library) {this.library = library;}
//dilosi geters and seters-------------------------------------------------------	




public Librarian(Library library) {
	this.library = library;
}
//Constructors--------------------------------------------------------------------------------







//methodoi+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
public void  findMeBooksFromAuthor(String onomaAuthor){// ton Author ton dinei o user
	library.printBooksFromAuthor(onomaAuthor);
	}
//Receives an author name and delegates the request to the library's printBooksFromAuthor method------------------------------------






//222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222
public void findMeAvailableBooks(){
	library.printAvailableBooks();
}




//33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333
public void findMeBook(String dosebiblio){
	library.printBookDetails(dosebiblio);	
}
// Receives a book's title and delegates the request to the library's printBookDetails method



//44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444
public void findMostPopularBook(){
	library.printTheMostPopularBook();
}


	
}//TELOS CLASS LIBRARIAN

