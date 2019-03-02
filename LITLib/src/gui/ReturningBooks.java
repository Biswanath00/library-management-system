package gui;

import java.awt.Dimension;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import buttonfun.ReturnBookButton;


public class ReturningBooks {
  
	JLabel MsgLabel= new JLabel("Please enter the date properly to calculate fines correctly.See impotant Notes for details.");
	JLabel EntReturnDateLabel =new JLabel("Enter Return Date   :");
    JLabel EntBookIdLabel     =new JLabel("Enter Book ID   :");
    
    JTextField EntReturnDateTxt =new JTextField();
    JTextField EntBookIdTxt     =new JTextField();
    
    JButton ReturnBook =new JButton("Return Book");
    
    //-------------------------------------------------------------------
    static JDateChooser jdc=new JDateChooser();
    //-------------------------------------------------------------------
    
	 Date dt =new Date();
	 JLabel DisplayDt       =new JLabel("Today  "+dt.toString());

	 
    public ReturningBooks()
    {
      Layout.rtBookPane.setLayout(null);
      Dimension size =MsgLabel.getPreferredSize();
 //------------------------------------------------------------------     
      MsgLabel.setBounds(0, 0, size.width+30, size.height+2);
      Layout.rtBookPane.add(MsgLabel);
      
      EntReturnDateLabel.setBounds(0, 60, size.width+10, size.height+2);
      Layout.rtBookPane.add(EntReturnDateLabel);  
      
      jdc.setBounds(250, 20,358,size.height+100);
      Layout.rtBookPane.add(jdc);
      
      EntBookIdLabel.setBounds(0, 170, size.width+10, size.height+2);
      Layout.rtBookPane.add(EntBookIdLabel);
      
      EntBookIdTxt.setBounds(250,140,358,size.height+100);
      Layout.rtBookPane.add(EntBookIdTxt);
      
      ReturnBookButton.ReturnButtonFun(ReturnBook);
      
      
      DisplayDt.setBounds(190, 280, size.width+203, size.height+18);
      Layout.rtBookPane.add(DisplayDt);
      
    }


	public JDateChooser getEntReturnDateTxt() {
		return jdc;
	}


	


	public JTextField getEntBookIdTxt() {
		return EntBookIdTxt;
	}


	


	


	
    
    
}
