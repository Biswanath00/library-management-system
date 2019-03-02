package buttonfun;

import gui.TransactionRecords;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import database.DataBaseForTransactionRec;
import gui.Layout;

public class TransactionRec {
	
	
	public static void TransactionDetail(JButton CheckTrans, Dimension size )
	{
		
		CheckTrans.setBounds(0,138 ,607, size.height+60);
		Layout.tsRecordPane.add(CheckTrans);
		
		CheckTrans.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				DataBaseForTransactionRec.TransactionRecDatabase();
				
			}
		});
	}

}
