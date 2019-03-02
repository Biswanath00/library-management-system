package gui;

import java.awt.Dimension;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import buttonfun.BorrowBookButton;

public class BorrowingBooks {

	 JLabel EntDateBorrowLabel =new  JLabel("Enter Date Borrow   :");
	 JLabel EntMemberIdLabel   =new  JLabel("Enter Member ID   :");
     JLabel EntBookIdLabel     =new  JLabel("Enter Book ID   :");
     
     
     JTextField EntDateBorrowTxt=new JTextField();
     JTextField EntMemberIdTxt  =new JTextField();
     JTextField EntBookIdTxt    =new JTextField();
     
     //-------------------------------------------------------------------
     static JDateChooser jdc=new JDateChooser();
     //-------------------------------------------------------------------
     JButton    BorrowBook      =new JButton("Borrow Book");
     
     Date dt =new Date();
	 JLabel DisplayDt       =new JLabel("Today  "+dt.toString());
     
    public BorrowingBooks()
    {
    	Layout.bwBookPane.setLayout(null);
        Dimension size =EntDateBorrowLabel.getPreferredSize();
   //-------------------------------------------------------------------
    	EntDateBorrowLabel.setBounds(0, 20, size.width, size.height);
    	Layout.bwBookPane.add(EntDateBorrowLabel);
       
    	jdc.setBounds(250, 0, 358, size.height+70);
    	Layout.bwBookPane.add(jdc);
    	
    	EntMemberIdLabel.setBounds(0, 120, size.width, size.height);
    	Layout.bwBookPane.add(EntMemberIdLabel);
    	
    	EntMemberIdTxt.setBounds(250,size.height+71,358,size.height+70);
    	Layout.bwBookPane.add(EntMemberIdTxt);
    	
    	EntBookIdLabel.setBounds(0, 220, size.width, size.height);
    	Layout.bwBookPane.add(EntBookIdLabel);
    	
    	
    	EntBookIdTxt.setBounds(250,(size.height+71)*2,358,size.height+70);
    	Layout.bwBookPane.add(EntBookIdTxt);
//-----------------------------------------------------------------------
    	
    	BorrowBookButton.BorrowBookButtonFun(BorrowBook);
    	DisplayDt.setBounds(190, 285, size.width+203, size.height+18);
        Layout.bwBookPane.add(DisplayDt);
    }

	public JButton getBorrowBook() {
		return BorrowBook;
	}
    
	public JDateChooser getDateChooser()
	{
		return jdc;
	}

	public JTextField getEntMemberIdTxt() {
		return EntMemberIdTxt;
	}

	public JTextField getEntBookIdTxt() {
		return EntBookIdTxt;
	}

	
	
    
}
