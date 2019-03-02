package gui;
import buttonfun.TransactionRec;

import java.awt.Dimension;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TransactionRecords {

	JLabel EntMemberId =new JLabel("Enter Member ID  :");
	public static JTextField EntMemberIdTxt =new JTextField();
	JButton CheckTrans      =new JButton("Check Transaction");
	
	Date dt =new Date();
	 JLabel DisplayDt       =new JLabel("Today  "+dt.toString());
	 
	 
	
	public TransactionRecords()
	{
	  Layout.tsRecordPane.setLayout(null);
	  
	  Dimension size = EntMemberId.getPreferredSize();
	   
	  EntMemberId.setBounds(0, 20, size.width, size.height);
	  Layout.tsRecordPane.add(EntMemberId);
	  
	  EntMemberIdTxt.setBounds(0,60,607,size.height+60);
  	  Layout.tsRecordPane.add(EntMemberIdTxt);
  	  
  	  TransactionRec.TransactionDetail(CheckTrans,size);
	  
	  DisplayDt.setBounds(190, 280, size.width+203, size.height+18);
      Layout.tsRecordPane.add(DisplayDt);
	  
	 
	  
	}
	 public static  JTextField EntMemberIdRef()
	  {
		 return EntMemberIdTxt; 
	  }
	
}
