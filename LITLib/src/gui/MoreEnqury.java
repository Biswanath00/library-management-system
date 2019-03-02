package gui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;

import buttonfun.BookDetailsBtn;
import buttonfun.MemberDetailsBnt;

public class MoreEnqury {
	
	JLabel  BookDetails =new JLabel("Book Details :");
	JButton BookDetailBtn =new JButton("Book Details ");
	JLabel  MemberDetails =new JLabel("Member Detatils :");
	JButton MemberDetailBtn=new JButton("Member Details ");
	
	
    public MoreEnqury()
    {
	 Layout.moreEnquryPane.setLayout(null);
	 Dimension size = BookDetails.getPreferredSize();
	 
	 BookDetails.setBounds(0, 10, size.width, size.height);
	 Layout.moreEnquryPane.add(BookDetails);
	 
	 BookDetailsBtn.BookDetailsfun(BookDetailBtn,size);
	 
	 MemberDetails.setBounds(0,150, size.width+40, size.height);
	 Layout.moreEnquryPane.add(MemberDetails);
	 
	 MemberDetailsBnt.MemberDetailsfun(MemberDetailBtn,size);
    }
}
