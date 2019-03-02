package buttonfun;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import database.DataBaseForBorrowBook;
import javax.swing.JButton;

import gui.Layout;

public class BorrowBookButton {
	
	public static void BorrowBookButtonFun(JButton borrowBook)
	{
		
		Dimension size=borrowBook.getPreferredSize();
		borrowBook.setBounds(0,262,607,size.height+2);
    	Layout.bwBookPane.add(borrowBook);
    	
    	borrowBook.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/YYYY");
		
				 
				 DataBaseForBorrowBook.BorrowBooks(sdf.format(Layout.BorrowingBooksInstance().getDateChooser().getDate()),Layout.BorrowingBooksInstance().getEntMemberIdTxt().getText(),Layout.BorrowingBooksInstance().getEntBookIdTxt().getText());
                 			
			}
    	});
	}

	

}
