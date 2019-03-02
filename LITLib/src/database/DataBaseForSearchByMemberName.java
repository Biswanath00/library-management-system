package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DataBaseForSearchByMemberName {
	
	public static void SearchMemberName(String Name)
	{
	try {
		int flag=0;
		Connection mycon= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root", "1234");
	    String sql="Select Add_Member  From addmembers";
	    Statement st =mycon.createStatement();
	    ResultSet rs = st.executeQuery(sql);
	    while(rs.next())
	    {
	      if(Name.compareToIgnoreCase(rs.getString(1))==0)
	    		  {
	    	        JOptionPane.showMessageDialog(null,"MEMBER NAME FOUND :) ");
	    	        flag=1;
	    		  }
	    }
	    if(flag==0)
	    	JOptionPane.showMessageDialog(null,"MEMBER NAME NOT FOUND :( " );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
