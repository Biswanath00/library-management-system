package gui;

import java.awt.Dimension;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import buttonfun.NewMember;

public class AddMember   {
   
	 JLabel MemberNameLabel  =new JLabel("Member Name  :"); 
	 JLabel AgeLabel         =new JLabel("Age          :"); 
	 JLabel IdLabel          =new JLabel("ID NO        :");
	 JLabel MemberTypeLabel  =new JLabel("Member Type    :");
	 JLabel AddressLabel     =new JLabel("Address      :");
	 JLabel TelephoneLabel   =new JLabel("Telephone      :");
	 
	 Date dt =new Date();
	
	 JLabel DisplayDt       =new JLabel("Today  "+dt.toString());
	 
	 JTextField MemberNameTxt =new JTextField();
     JTextField AgeTxt        =new JTextField();	
     JTextField IdTxt         =new JTextField();
     JTextField MemberTypeTxt =new JTextField();
     JTextField AddressTxt    =new JTextField();
     JTextField TelephoneTxt  =new JTextField();
     
     
     public JTextField getMemberNameTxt() {
		return MemberNameTxt;
	}



	


	public JTextField getAgeTxt() {
		return AgeTxt;
	}



	

	public JTextField getIdTxt() {
		return IdTxt;
	}



	


	public JTextField getMemberTypeTxt() {
		return MemberTypeTxt;
	}



	

	public JTextField getAddressTxt() {
		return AddressTxt;
	}






	public JTextField getTelephoneTxt() {
		return TelephoneTxt;
	}



	static JButton CreateNewMember =new JButton("Create New Member");  
     
	public AddMember()
	  {  Layout.addMemberPane.setLayout(null);
		 
		     Dimension size = MemberNameLabel.getPreferredSize();
		   MemberNameLabel.setBounds(0, 15, size.width, size.height);
		   Layout.addMemberPane .add(MemberNameLabel);
	       
	       
		   AgeLabel.setBounds(0, 56, size.width, size.height);
		   Layout.addMemberPane .add(AgeLabel);
	       
	       IdLabel.setBounds(0, 97, size.width, size.height);
	       Layout.addMemberPane.add(IdLabel);
	       
	       MemberTypeLabel.setBounds(0, 138, size.width+2, size.height);
	       Layout.addMemberPane.add(MemberTypeLabel);		  
           
           AddressLabel.setBounds(0,179 , size.width, size.height);
           Layout.addMemberPane.add(AddressLabel);
           
           TelephoneLabel.setBounds(0, 220, size.width+2, size.height);
           Layout.addMemberPane.add(TelephoneLabel);
 //------------------------------------------------------------------------------------------------------------------------------          
           MemberNameTxt.setBounds(320, 5, size.width+193, size.height+17);
           Layout. addMemberPane.add(MemberNameTxt);
           
           AgeTxt.setBounds(320, 46, size.width+193, size.height+17);
           Layout.addMemberPane.add(AgeTxt);
           
          IdTxt.setBounds(320, 87, size.width+193, size.height+17);
          Layout.addMemberPane.add(IdTxt);
          
          MemberTypeTxt.setBounds(320, 128, size.width+193, size.height+17);
          Layout.addMemberPane.add(MemberTypeTxt);
          
         AddressTxt.setBounds(320, 169, size.width+193, size.height+17);
         Layout. addMemberPane.add(AddressTxt);
         
         TelephoneTxt.setBounds(320, 210, size.width+193, size.height+17);
         Layout.addMemberPane.add(TelephoneTxt);
         
    /*     CreateNewMember.setBounds(2, 250, size.width+510, size.height+18);
           Layout.addMemberPane.add(CreateNewMember);*/
          
           NewMember.ButtonAdd();
         
         DisplayDt.setBounds(190, 280, size.width+193, size.height+18);
         Layout.addMemberPane.add(DisplayDt);
	  }
	
	  
	
	 public static JButton ButtonInstance()
	 {
		 return CreateNewMember;
	 }
	 
}
