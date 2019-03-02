package buttonfun;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import database.DatabaseForTotalBooks;
import gui.Layout;

public class BookDetailsBtn {
	
	public static void BookDetailsfun(JButton BookDetailBtn ,Dimension size)
	{
		BookDetailBtn.setBounds(0,30,size.width+530, size.height+15);
		 Layout.moreEnquryPane.add(BookDetailBtn);
		    
		  BookDetailBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				DatabaseForTotalBooks.DisplayBooks();
				
				
				
			}
		});
	
	}

}
