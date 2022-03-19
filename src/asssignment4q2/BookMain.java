package asssignment4q2;

public class BookMain {
	public static void main(String gg[])
	{
	BookCollection bc=new BookCollection("Swapnali");
	Book b=new Book(114, "mindset", "bar");
	System.out.println("Book already exist :"+bc.hasBook(b));
	bc.toString();
	System.out.println("\n");
	
	bc.sort1();
	System.out.println("\n");
	bc.sort2();
	}

}
