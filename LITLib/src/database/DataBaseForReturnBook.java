package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement ;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import javax.naming.spi.DirStateFactory.Result;
public class DataBaseForReturnBook {
	
	public static void ReturnBookInfo(String rtndt,String bookid)
	{    
		String Bdate =null;
		try {
			long fine=0;
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false","root", "1234");
			
	        String sql2="select Ent_Borrow_Date from borrow_and_return  where Ent_BookId="+bookid;
	        
	        Statement st =mycon.createStatement();
	        ResultSet rs =st.executeQuery(sql2);
	        
	        
	        
	        if(rs.next())
	        {
	        Bdate =rs.getString(1);
	        }
	      
	        rs.close();
	     
	        SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
	        Date borrowdate = sdf.parse(Bdate);
	        Date returndate = sdf.parse(rtndt);
	        System.out.println(returndate.getTime()+" "+borrowdate.getTime());
	        long diffMillies=Math.abs(returndate.getTime()-borrowdate.getTime());
	        
	        long  totalday= TimeUnit.DAYS.convert(diffMillies, TimeUnit.MILLISECONDS);
	        
	        if(totalday>30)
	            fine=(totalday-30)*5;	
	        System.out.println(totalday);
	        
	        String sql1 ="update borrow_and_return set Ent_Return_Date=?,fee_for_fine=? where Ent_BookId= ?";
	        PreparedStatement pre=mycon.prepareStatement(sql1);
	        pre.setString(1, rtndt);
	        pre.setInt(2, (int)fine);
	        pre.setString(3, bookid);	        
	        pre.executeUpdate();
	        pre.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
