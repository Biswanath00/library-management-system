package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JTextField;



public class DataBaseBooks {

	public static void DataBaseCall(String BookName, String AuthorName, String PublisherName, String BookType , String BookId , String Year) {
		
		try {
		
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root", "1234");
			String sql="INSERT INTO NewBooks  VALUES (?,?,?,?,?,?);";
			PreparedStatement prstm=mycon.prepareStatement(sql);
			
			prstm.setString(1, BookName);
			prstm.setString(2, AuthorName);
            prstm.setString(3, PublisherName);
            prstm.setString(4, BookType);
            prstm.setString(5, BookId);
            prstm.setString(6, Year);
            prstm.executeUpdate();
            } catch (Exception e) {
			
		}
		
	}

	

}
