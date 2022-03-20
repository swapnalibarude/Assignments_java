package Assignmnet5q3;
import java.util.List;
import java.util.stream.Collectors;


public class BookServiceImpl implements BookService {
	private BookDao bookDao;
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	public List<String> getBooks(String subject) {
		
		return bookDao.getBooks().stream().filter
				(title -> title.contains(subject)).collect(Collectors.toList());
	}

}
