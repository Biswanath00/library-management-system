package database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.Connection;

public class DataBaseForTotalMember {
	
	public static void TotalMember()
	{ 
		int row =0;
	  Object []colmn= {"Member Name","Age","ID No","Member Type","Address","Telephone"};
	   
		try 
		{
	  Connection myconn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "1234");
	  String sql="select * from addmembers";
	  Statement st =myconn.createStatement();
	  ResultSet rs =st.executeQuery(sql);
	
	while(rs.next())
		 {
			row++;	
		 }
	//	 System.out.println(row);
/////////////////////////////////////////////////////////////////////////////////
		 Object [][]data= new Object[row][6] ;
/////////////////////////////////////////////////////////////////////////////////
		 rs=st.executeQuery(sql);
	
		 int i=0;
	   while(rs.next())
	   {   
		   
		   String Add_Member=rs.getString("Add_Member");
		   String  Age=rs.getString("Age");
		   String ID_No=rs.getString("ID_No");
		   String MemberType=rs.getString("Member_Type");
		   String  Address=rs.getString("Address");
		   String  Telephone=rs.getString("Telephone");
		   data[i][0]=Add_Member;
		   data[i][1]= Age;
		   data[i][2]=ID_No; 
		   data[i][3]=MemberType;
		   data[i][4]= Address;
		   data[i][5]=Telephone;
		   i++;
		   
	   }
	 //  System.out.println(i);
	  
	    
	 JTable table =new JTable(data,colmn);
	 table.setPreferredScrollableViewportSize(new Dimension(600,330));
	// table.setFillsViewportHeight(true);
	 JScrollPane showTable=new JScrollPane(table);
	 JFrame show=new JFrame("Table");
	    show.setLayout(new FlowLayout());
	    show.setSize(630, 400);
	 show.add(showTable);
	 show.setVisible(true);

		}
		catch(SQLException e)
		{
			
		}
	}

}
