package buttonfun;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JButton;

import database.DataBaseForReturnBook;
import gui.Layout;

public class ReturnBookButton {
	
	public static void ReturnButtonFun(JButton ReturnBook )
	{
		Dimension size=ReturnBook.getPreferredSize();
		ReturnBook.setBounds(0, 257, size.width+505,size.height+4);
	      Layout.rtBookPane.add(ReturnBook);
	      
	      ReturnBook.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/YYYY");
				
				String Rtndt= sdf.format(Layout.ReturningBooksInstance().getEntReturnDateTxt().getDate());
				String id=Layout.ReturningBooksInstance().getEntBookIdTxt().getText();
				
				DataBaseForReturnBook.ReturnBookInfo(Rtndt,id);
				
			}
		});
		
	}
	  

}
