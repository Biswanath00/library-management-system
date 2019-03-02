package buttonfun;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import database.DataBaseForSearchByBookId;
import gui.Layout;
import gui.Search;



public class SearchBookById {

   public static void  SearchBookTrId()
   {   
	  JButton SearchBookId = Search.getSearchBookId();
	  Dimension size= SearchBookId.getPreferredSize();
	  SearchBookId.setBounds(0, 70, size.width+175, size.height);
	  Layout.searchPane.add(SearchBookId); 
	  
	  SearchBookId.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			DataBaseForSearchByBookId.SearchBookById(Layout.SearchInstance().getEntBookIdTxt().getText());		
		}
	});;
		
   }
}
