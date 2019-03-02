package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DataBaseForSearchByBookName {
	
	public static void SearchByBookName(String Name)
	{
		
		try {
			int flag=0;
		Connection mycon= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root", "1234");
	    String sql="Select Book_Name  From newbooks";
	    Statement st =mycon.createStatement();
	    ResultSet rs = st.executeQuery(sql);
	    while(rs.next())
	    {
	      if(Name.compareToIgnoreCase(rs.getString("Book_Name"))==0)
	    		  {
	    	        JOptionPane.showMessageDialog(null,"BOOK  FOUND :) ");
	    	        flag=1;
	    		  }
	    }
	    if(flag==0)
	    	JOptionPane.showMessageDialog(null,"BOOK  NOT FOUND :( " );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
