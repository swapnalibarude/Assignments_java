package Assignmnet5q3;
import java.util.Arrays;
import java.util.List;

public class BookDaoImp implements BookDao {
	public List<String> getBooks() {
		
		System.out.println("i am called");
		return Arrays.asList("java adv","java basics","rich dad poor dad");
	}


}
