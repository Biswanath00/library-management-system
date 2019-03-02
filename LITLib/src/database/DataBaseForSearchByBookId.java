	package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class DataBaseForSearchByBookId {
	
	
	public static void SearchBookById(String Id)
	{
		try {
			int flag=0;
			Connection mycon= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root", "1234");
		    String sql="Select Book_Id From newbooks";
		    Statement st =mycon.createStatement();
		    ResultSet rs = st.executeQuery(sql);
		    while(rs.next())
		    {
		    
		      if(Id.compareToIgnoreCase(rs.getString(1))==0)
		    		  {
		    	        JOptionPane.showMessageDialog(null,"BOOK FOUND :) ");
		    	        flag=1;
		    		  }
		    }
		    if(flag==0)
		    	JOptionPane.showMessageDialog(null,"BOOK NOT FOUND :( " );
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
