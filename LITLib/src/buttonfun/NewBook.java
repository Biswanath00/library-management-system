package buttonfun;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JOptionPane;

import database.DataBaseBooks;
import gui.Layout;
import gui.AddBooks;
public class NewBook {
   
	 public static void ButtonAdd()
	 {      
		    JButton CreateNewBook =AddBooks.getCreateNewBook();
		    Dimension size=CreateNewBook.getPreferredSize();
		    CreateNewBook.setBounds(2, 250, size.width+472, size.height+9);
	        Layout.addBookPane.add(CreateNewBook);
	        
	       CreateNewBook.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
			 
				 AddBooks addbooks =Layout.AddBookInstance();
				 DataBaseBooks.DataBaseCall(addbooks.getBookNameTxt().getText(),addbooks.getAuthorNameTxt().getText(),addbooks.getPublisherNameTxt().getText(),addbooks.getBookTypeTxt().getText(),addbooks.getBookIdTxt().getText(),addbooks.getYearTxt().getText());
				 addbooks.getBookNameTxt().setText("");
				 addbooks.getAuthorNameTxt().setText("");
				 addbooks.getPublisherNameTxt().setText("");
				 addbooks.getBookTypeTxt().setText("");
				 addbooks.getBookIdTxt().setText("");
				 addbooks.getYearTxt().setText("");
				 
				  JOptionPane.showMessageDialog(null,"Successfully Done");
				
			}
		});
	 }

	
}
