package gui;

import java.awt.Dimension;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import buttonfun.NewBook;

public class AddBooks {
	JLabel BookNameLabel  =new JLabel("Book Name  :"); 
	 JLabel AuthorNameLabel         =new JLabel("Author Name       :"); 
	 JLabel PublisherNameLabel         =new JLabel("Publisher Name      :");
	 JLabel BookTypeLabel  =new JLabel("Book Type    :");
	 JLabel BookIdLabel     =new JLabel("Book ID     :");
	 JLabel YearLabel   =new JLabel("Year     :");
	 
	 Date dt =new Date();
	 JLabel DisplayDt       =new JLabel("Today  "+dt.toString());
	 
	 JTextField BookNameTxt =new JTextField();
    JTextField AuthorNameTxt        =new JTextField();	
    JTextField PublisherNameTxt         =new JTextField();
    JTextField BookTypeTxt =new JTextField();
    JTextField BookIdTxt    =new JTextField();
    JTextField YearTxt  =new JTextField();
    
    
    static JButton CreateNewBook =new JButton("Create New Book");  
    
	public AddBooks()
	  {  Layout.addBookPane.setLayout(null);
		 
		     Dimension size = BookNameLabel.getPreferredSize();
		   BookNameLabel.setBounds(0, 15, size.width, size.height);
		   Layout.addBookPane .add(BookNameLabel);
	       
	       
		   AuthorNameLabel.setBounds(0, 56, size.width+40, size.height);
		   Layout.addBookPane .add(AuthorNameLabel);
	       
		   PublisherNameLabel.setBounds(0, 97, size.width+40, size.height);
	       Layout.addBookPane.add(PublisherNameLabel);
	       
	       BookTypeLabel.setBounds(0, 138, size.width+2, size.height);
	       Layout.addBookPane.add(BookTypeLabel);		  
          
          BookIdLabel.setBounds(0,179 , size.width, size.height);
          Layout.addBookPane.add(BookIdLabel);
          
          YearLabel.setBounds(0, 220, size.width+2, size.height);
          Layout.addBookPane.add(YearLabel);
//------------------------------------------------------------------------------------------------------------------------------          
          BookNameTxt.setBounds(320, 5, size.width+203, size.height+17);
          Layout. addBookPane.add(BookNameTxt);
          
          AuthorNameTxt.setBounds(320, 46, size.width+203, size.height+17);
          Layout.addBookPane.add(AuthorNameTxt);
          
         PublisherNameTxt.setBounds(320, 87, size.width+203, size.height+17);
         Layout.addBookPane.add(PublisherNameTxt);
         
         BookTypeTxt.setBounds(320, 128, size.width+203, size.height+17);
         Layout.addBookPane.add(BookTypeTxt);
         
        BookIdTxt.setBounds(320, 169, size.width+203, size.height+17);
        Layout. addBookPane.add(BookIdTxt);
        
        YearTxt.setBounds(320, 210, size.width+203, size.height+17);
        Layout.addBookPane.add(YearTxt);
        
         NewBook.ButtonAdd();
         
        DisplayDt.setBounds(190, 280, size.width+203, size.height+18);
        Layout.addBookPane.add(DisplayDt);
}

	public static JButton getCreateNewBook() {
		return CreateNewBook;
	}

	public JTextField getBookNameTxt() {
		return BookNameTxt;
	}

	public JTextField getAuthorNameTxt() {
		return AuthorNameTxt;
	}

	public JTextField getPublisherNameTxt() {
		return PublisherNameTxt;
	}

	public JTextField getBookTypeTxt() {
		return BookTypeTxt;
	}

	public JTextField getBookIdTxt() {
		return BookIdTxt;
	}

	public JTextField getYearTxt() {
		return YearTxt;
	}


}
