package buttonfun;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import database.DataBaseForSearchByMemberName;
import gui.Layout;
import gui.Search;

public class SearchMemberByName {
	
	public static void SearchMemberTrName()
	{
		JButton SearchMemberName=Search.getSearchMemberName();
		Dimension size =SearchMemberName.getPreferredSize();
		SearchMemberName.setBounds(size.width+165,223, size.width+138, size.height);
		Layout.searchPane.add(SearchMemberName);
		
		SearchMemberName.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DataBaseForSearchByMemberName.SearchMemberName(Layout.SearchInstance().getEntMemberNameTxt().getText());
				
			}
		});
		
	}

}
