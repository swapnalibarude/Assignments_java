package demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBook {
	public static void main(String[] args) {
		//1. u need to load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded..");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		PreparedStatement stmt=null;
		Connection connection=null;
		
		try {
			 connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/book", "root", "Swapnali@11411");
			
			stmt=connection.
					prepareStatement("update book set book_price = ? where book_id=?");
			
			
			stmt.setInt(1, 1411);
			stmt.setInt(2, 103);
			
			int noOfRowsEffected= stmt.executeUpdate();
			System.out.println(noOfRowsEffected);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
