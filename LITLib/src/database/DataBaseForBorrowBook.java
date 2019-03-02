package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class DataBaseForBorrowBook {
	
	public static void BorrowBooks(String Borrowdate,String MemberId,String BookId)
	{
		try {
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root", "1234");
		    String sql="Insert  into borrow_and_return values(?,?,?,?) ";
		    PreparedStatement ps= mycon.prepareStatement(sql);
      ps.setString(1, Borrowdate);
      ps.setString(2, MemberId);
      ps.setString(3, BookId);
      ps.setString(4, "");
      ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
