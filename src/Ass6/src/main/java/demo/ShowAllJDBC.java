package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ShowAllJDBC {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
	} catch (ClassNotFoundException e) {
	
		e.printStackTrace();
	}
	Statement stmt=null;
	ResultSet rs=null;
	Connection connection=null;
	
	try {
		 connection=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/book", "root", "Swapnali@1411");
		
		stmt=connection.createStatement();
		rs=stmt.executeQuery("select * from book");			//executeQuery  vs executeUpdate
		
		while(rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("book_name"));
			System.out.println(rs.getString("author"));
			System.out.println(rs.getInt("prize"));
		}
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
