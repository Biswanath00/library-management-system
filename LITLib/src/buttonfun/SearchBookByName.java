package buttonfun;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


import database.DataBaseForSearchByBookName;
import gui.Layout;
import gui.Search;

public class SearchBookByName {
	
	public static void  SearchByBookName()
	{
		JButton SearchBookName= Search.getSearchBookName();
		Dimension size =SearchBookName.getPreferredSize();
		
		SearchBookName.setBounds(size.width+177,70 , size.width+150, size.height);
		Layout.searchPane.add(SearchBookName);
		
		SearchBookName.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				DataBaseForSearchByBookName.SearchByBookName(Layout.SearchInstance().getEntBookNameTxt().getText());
				
			}
		});
	}

}
