package buttonfun;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import database.DataBaseForSearchByMemberId;
import gui.Layout;
import gui.Search;

public class SearchMemberById {
	
	public static void SearchMemberTrId()
	{
		JButton SearchMemberId= Search.getSearchMemberId();
		Dimension size =SearchMemberId.getPreferredSize();
		SearchMemberId.setBounds(0, 223, size.width+163, size.height);
		Layout.searchPane.add(SearchMemberId);
		
		SearchMemberId.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
				DataBaseForSearchByMemberId.SearchMemberById(Layout.SearchInstance().getEntMemberIdTxt().getText());
				
			}
		});
	}

}
