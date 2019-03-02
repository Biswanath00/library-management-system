package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Driver;

import gui.TransactionRecords;

public class DataBaseForTransactionRec {
	
	public static void TransactionRecDatabase()
	{
		int flag=0;
		int fee = -1;
	try
	{   JFrame msg =new JFrame();
		Connection myconn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root", "1234");
		String sql ="Select fee_for_fine from  borrow_and_return where  Ent_MemberId="+TransactionRecords.EntMemberIdRef().getText();
		Statement st =myconn .createStatement();
		ResultSet rs= st.executeQuery(sql);
		if(rs.next()){   
			 flag = 1;
		     fee =rs.getInt("fee_for_fine");
		    if(fee!=0)
		    JOptionPane.showMessageDialog(msg,"Fee Need To Deposit :"+fee);
		    }
		else
		{
			JOptionPane.showMessageDialog(msg,"No Book Issued By The Member !");
			flag=1;
		}
		 if(flag==0 || fee==0)
		{
			 JOptionPane.showMessageDialog(msg,"NO FEE NEEED .");
		}
		TransactionRecords.EntMemberIdRef().setText("");
	}
	catch(SQLException e)
	{
		
	}
	}
}
