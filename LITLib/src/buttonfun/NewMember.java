package buttonfun;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import database.DataBaseMember;
import gui.Layout;


import gui.AddMember;

public class NewMember{ 
	
	 
	  public static  void ButtonAdd() { 
		  JButton CreateNewMember=  AddMember.ButtonInstance();
		   Dimension size = CreateNewMember.getPreferredSize();
	  CreateNewMember.setBounds(2, 250, size.width+455, size.height+10);
      Layout.addMemberPane.add(CreateNewMember);
      
      CreateNewMember.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent e) {
			AddMember addmemberobj =Layout.AddMemberInstance();
		    DataBaseMember.DataBaseCall(addmemberobj.getMemberNameTxt().getText(),Integer.parseInt(addmemberobj.getAgeTxt().getText()),addmemberobj.getIdTxt().getText(),addmemberobj.getMemberTypeTxt().getText(),addmemberobj.getAddressTxt().getText(),addmemberobj.getTelephoneTxt().getText()); 
		    
		    addmemberobj.getMemberNameTxt().setText("");
			addmemberobj.getAgeTxt().setText("");
			addmemberobj.getIdTxt().setText("");
			addmemberobj.getMemberTypeTxt().setText("");
			addmemberobj.getAddressTxt().setText("");
		    addmemberobj.getTelephoneTxt().setText("");
		    JOptionPane.showMessageDialog(null,"Successfully Done");
		 
		}
	});
	  } 
	   
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

