package assignment2q2;

public class BookStore {
	private final int SIZE;
	private String bookStoreName;
	private Book[] books;
	
	public BookStore(String bookStoreName, int size) {
		SIZE=size;
		this.bookStoreName = bookStoreName;
		this.books = new Book[SIZE];
		init();
	}
	//populate some books
	private void init() {
			books[0]=new Book("mindset", "carol", "1234455", 20);
			books[1]=new Book("dreams", "rk", "9865", 10);
			books[2]=new Book("kathakalash", " xy", "45687", 18);
			books[3]=new Book("mrutynjay", "ss", "456768", 15);
			books[4]=new Book("harry potter", "pr","987654", 9);
	}



	public void sell(String bookTitle, int noOfCopies) {
		boolean found=false;
		for(int i=0;i<SIZE; i++) {
			if(	books[i].getBookTitle().equals(bookTitle)) {
				
				books[i].setNumOfCopies(books[i].getNumOfCopies()-noOfCopies);
				found=true;
			}
		}
		
		if(found)
			System.out.println("book sell is successful");
		else
			System.out.println("book is not found in store");
	}

	public void order(String bookTitle, int noOfCopies) {
		boolean found=false;
		for(int i=0;i<SIZE; i++) {
			if(	books[i].getBookTitle().equals(bookTitle)) {
				books[i].setNumOfCopies(books[i].getNumOfCopies()+noOfCopies);
				found=true;
			}
		}
		if(found)
			System.out.println("book order is successful");
		else
			System.out.println("book order is not successful");
	}

	public void display() {
		System.out.println("Book store");
		System.out.println(bookStoreName);
		System.out.println("Books details");
		for(Book book: books) {
			book.display();
		}
	
		
	}

}
