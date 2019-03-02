package buttonfun;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import database.DataBaseForTotalMember;
import gui.Layout;

public class MemberDetailsBnt {
	
	public static void MemberDetailsfun(JButton MemberDetailBtn,Dimension size )
	{
		 MemberDetailBtn.setBounds(0, 174,size.width+530 , size.height+15);
		 Layout.moreEnquryPane.add(MemberDetailBtn);
		 
		 MemberDetailBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				DataBaseForTotalMember.TotalMember();
			}
		});
	}
}
