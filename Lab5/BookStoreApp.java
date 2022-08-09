import java.util.Scanner;
import java.util.ArrayList;

public class BookStoreApp {
	
	public static void main(String args[]) {
		
		String bTitle;
		String bAuthor;
		String bISBN;
		int bnumOfCopies;
		
		int n;
		
		Scanner scan = new Scanner(System.in);
		BookStore bs = new BookStore("UAP Book Store");
		
		//Book book1 = new Book("Java","Herbert","123",20);
		//bs.books.add(book1);
		
		while(true)
		{
			System.out.println("Press 1 to Display Information");
			System.out.println("Press 2 to Order Books");
			System.out.println("Press 3 to Sell Books");
			System.out.println("Press 0 to Exit");
			n = scan.nextInt();
			
			if(n==0)
				break;
			else if(n==1) {
				bs.display();
			}
			else if(n==2) {
				System.out.println("Enter the ISBN no. of the book");
				bISBN = scan.next();
				System.out.println("Enter no. of copies u want");
				bnumOfCopies = scan.nextInt();
				bs.order(bISBN, bnumOfCopies);
			}
			else if(n==3) {
				System.out.println("Enter the Title of the book");
				bTitle = scan.next();
				System.out.println("Enter no. of copies u want to sell");
				bnumOfCopies = scan.nextInt();
				bs.order(bTitle, bnumOfCopies);
				bs.sell(bTitle, 10);
			}
				
		}		
		
	}
}
