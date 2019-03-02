package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Layout extends JFrame {
    
 
 public  static  JPanel addMemberPane =new JPanel();
 public  static  JPanel addBookPane =new JPanel();
 public  static  JPanel searchPane =new JPanel();
 public  static  JPanel rtBookPane =new JPanel();
 public  static  JPanel bwBookPane =new JPanel();
 public  static  JPanel tsRecordPane =new JPanel();
 public  static  JPanel dSignedPane =new JPanel();
 public  static  JPanel impNotePane =new JPanel();
 public  static  JPanel moreEnquryPane =new JPanel();
    
    
   
   
    JTabbedPane tabPane   =new JTabbedPane();
   
    public static Layout la= new Layout();
	private static AddMember FAddMember;
	private static AddBooks FAddBooks;
	private static Search FSearch;
	private static BorrowingBooks FBorrowingBooks;
	private static ReturningBooks FReturnBooks ;
	private static MoreEnqury Moreenqury;
	private static TransactionRecords Transaction_rec;
	public static void main(String[] args) {
	    
		 FAddMember=new AddMember();
	     FAddBooks= new AddBooks();
	     FSearch =  new Search();
	     FReturnBooks =new ReturningBooks();
	     FBorrowingBooks= new BorrowingBooks();
	     Transaction_rec= new TransactionRecords();
	     Moreenqury=new MoreEnqury();
	     
	     
	     
         la.linkPaneLabel();
		 la.setTitle("LibraryManagementSystem");
		 la.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 la.setSize(630, 400);
		 la.setVisible(true);
	    
	    
	}
	public static AddMember AddMemberInstance()
	{
	return FAddMember;
	}
	
	public static AddBooks AddBookInstance()
	{
		 return FAddBooks;
	}
	
	public static Search SearchInstance()
	{
		return FSearch;
	}
    
 public static BorrowingBooks BorrowingBooksInstance() {
		return FBorrowingBooks;
	}
 public static ReturningBooks ReturningBooksInstance()
 {
	 return FReturnBooks;
 }
	
public  void linkPaneLabel()
 {

	 tabPane.add("Add Members", addMemberPane );
	 tabPane.add("Add Books", addBookPane );
	 tabPane.add("Search", searchPane);
	 tabPane.add("Returning Books", rtBookPane );
	 tabPane.add("Borrowing Books",  bwBookPane );
	 tabPane.add("Transaction Record", tsRecordPane);
	 tabPane.add("Designed By", dSignedPane );
	 tabPane.add("Important Note", impNotePane );
	 tabPane.add("More Enqury", moreEnquryPane );
	 add(tabPane);
	 
 }
 



}
