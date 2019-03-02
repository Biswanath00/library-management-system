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
public class DatabaseForTotalBooks  {
	
	
	public static void DisplayBooks()
	{
	    
		int row = 0;
	
		Object []colmn= {"Book Name","Author Name","Publisher Name","Book_Type","Book_Id","Year"};
		try {
			Connection myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "1234");
			String sql="select  * from newbooks";

			Statement st =myconn.createStatement();
			
			ResultSet rs=st.executeQuery(sql);
			 while(rs.next())
			 {
				row++;
				
				
			 }
			// System.out.println(row);
/////////////////////////////////////////////////////////////////////////////////
			 Object [][]data= new Object[row][6] ;
/////////////////////////////////////////////////////////////////////////////////
			 rs=st.executeQuery(sql);
			
			 int i=0;
		   while(rs.next())
		   {   
			   
			   String BookName=rs.getString("Book_Name");
			   String AuthorName=rs.getString("Author_Name");
			   String PublisherName=rs.getString("Publisher_name");
			   String BookType=rs.getString("Book_Type");
			   String BookId=rs.getString("Book_Id");
			   String Year=rs.getString("Year");
			   data[i][0]=BookName;
			   data[i][1]=AuthorName;
			   data[i][2]=PublisherName; 	
			   data[i][3]=BookType;
			   data[i][4]=BookId;
			   data[i][5]=Year;
			   i++;
			   
		   }
		   
		  
		    
		 JTable table =new JTable(data,colmn);
		 table.setPreferredScrollableViewportSize(new Dimension(965,330));
		 table.setFillsViewportHeight(true);
		 JScrollPane showTable=new JScrollPane(table);
		 JFrame show=new JFrame("Table");
		    show.setLayout(new FlowLayout());
		    show.setSize(1000, 400);
		 show.add(showTable);
		 show.setVisible(true);
	
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

}
