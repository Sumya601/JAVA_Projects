import java.util.ArrayList;
import java.util.Scanner;
public class BookStore {
	String name;
	String bTitle;
	String bAuthor;
	String bISBN;
	int bCopies;
	ArrayList<Book> books = new ArrayList<Book>();
	
	public BookStore(String name) {
		this.name = name;
	}
	
	public void sell(String title, int copies) {
		
		boolean found = false;
		
		for(int i=0;i<books.size();i++) {
			Book boi = books.get(i);
			if(boi.bookTitle.equals(title)) {
				found = true;
				if(boi.numOfCopies >= copies) {
					boi.numOfCopies -= copies;
					break;
				}
					
				else
					System.out.println("Books are short you can take "+boi.numOfCopies+" at most.");
			}
			if(!found)
				System.out.println("The book is not available");
		}
	}
	
public void order(String isbn, int copies) {
		
		boolean found = false;
		for(int i=0; i<books.size(); i++) {
			Book boi = books.get(i);
			if(boi.bookISBN.equals(isbn)) {
				found = true;
				boi.numOfCopies += copies;
				break;
			}
		}
		
		if(!found)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter book title and author name for book with isbn:"+isbn);
			String t = scan.nextLine();
			String a = scan.nextLine();
			books.add(new Book(t, a, isbn, copies));
		}
				
	}
	
	public void display() {
		System.out.println(name);
		for (Book boi: books)
			boi.display();
	}
}
