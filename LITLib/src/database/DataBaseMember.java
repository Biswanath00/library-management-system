package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DataBaseMember {


	public static void DataBaseCall(String MemberName, int Age, String Id , String MemberType, String Address, String Telephone) {   
       try {
		Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root", "1234");
	  
		String sql = "INSERT INTO addmembers  values (?,?,?,?,?,?);";
		PreparedStatement preparedStatement = mycon.prepareStatement(sql);
		preparedStatement.setString(1, MemberName);
		preparedStatement.setInt(2, Age);
		preparedStatement.setString(3, Id);
		preparedStatement.setString(4, MemberType);
		preparedStatement.setString(5, Address);
		preparedStatement.setString(6, Telephone);
	    preparedStatement.executeUpdate();

	   
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
       
     
    		   
    		   
	}


}
