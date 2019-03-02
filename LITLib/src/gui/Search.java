package gui;

import java.awt.Dimension;
import buttonfun.SearchBookById;
import buttonfun.SearchBookByName;
import buttonfun.SearchMemberById;
import buttonfun.SearchMemberByName;

import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Search {
	JLabel EntBookIdLabel =new JLabel("Enter Book ID   :");
	JLabel EntBookNameLabel =new JLabel("Enter Book Name  :");
	JLabel EntMemberIdLabel =new JLabel("Enter Member ID  :");
	JLabel EntMemberNameLabel =new JLabel("Enter Member Name   :");
	
    JTextField EntBookIdTxt     =new JTextField();
   	JTextField EntBookNameTxt   =new JTextField();
    JTextField EntMemberIdTxt   =new JTextField();
	JTextField EntMemberNameTxt =new JTextField();
	
    static JButton SearchBookId           =new JButton("Search For Book   ");
	static JButton SearchBookName         =new JButton("Search For Book   ");
	static JButton SearchMemberName       =new JButton("Search For Member ");
	static JButton SearchMemberId         =new JButton("Search For Member ");
	
	
	 Date dt =new Date();
	 JLabel DisplayDt       =new JLabel("Today  "+dt.toString());
	 
	 
	public Search()
	{
		
	 Layout.searchPane.setLayout(null);
	 Dimension size=EntBookIdLabel.getPreferredSize();
	 //--------------------------------------------------------------------
	 EntBookIdLabel.setBounds(0, 15, size.width+10, size.height);
	 Layout.searchPane.add(EntBookIdLabel);	 
	 
	 EntBookIdTxt.setBounds(0, 40, size.width+225,size.height+10);
	 Layout.searchPane.add(EntBookIdTxt);
	 
	 SearchBookById.SearchBookTrId();
     	 
//-------------------------------------------------------------------------	 
	EntMemberIdLabel.setBounds(0, 170, size.width+20, size.height);
	Layout.searchPane.add(EntMemberIdLabel);
	
	EntMemberIdTxt.setBounds(0, 195, size.width+225, size.height+10);
	Layout.searchPane.add(EntMemberIdTxt);
	
	SearchMemberById.SearchMemberTrId();
//--------------------------------------------------------------------------	

	EntBookNameLabel.setBounds(size.width+230, 15, size.width+20, size.height);
	Layout.searchPane.add(EntBookNameLabel);
	
	EntBookNameTxt.setBounds(size.width+225,40, size.width+200, size.height+10);
	Layout.searchPane.add(EntBookNameTxt);
	
	SearchBookByName.SearchByBookName();
//-----------------------------------------------------------------------------------	
	EntMemberNameLabel.setBounds(size.width+230,164, size.width+40, size.height+10);
	Layout.searchPane.add(EntMemberNameLabel);
	
	EntMemberNameTxt.setBounds(size.width+225,195,size.width+200, size.height+10);
	Layout.searchPane.add(EntMemberNameTxt);
	
	SearchMemberByName.SearchMemberTrName();
//-------------------------------------------------------------------------------------	
	 DisplayDt.setBounds(190, 280, size.width+203, size.height+18);
     Layout.searchPane.add(DisplayDt);
	}


	public JTextField getEntBookIdTxt() {
		return EntBookIdTxt;
	}


	public  JTextField getEntBookNameTxt() {
		return EntBookNameTxt;
	}


	public JTextField getEntMemberIdTxt() {
		return EntMemberIdTxt;
	}


	public  JTextField getEntMemberNameTxt() {
		return EntMemberNameTxt;
	}


	public static JButton getSearchBookId() {
		return SearchBookId;
	}


	public static JButton getSearchBookName() {
		return SearchBookName;
	}


	public static  JButton getSearchMemberName() {
		return SearchMemberName;
	}


	public static JButton getSearchMemberId() {
		return SearchMemberId;
	}
	
	
	

}
