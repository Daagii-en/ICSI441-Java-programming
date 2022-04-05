package lab06;

abstract class Member {

	protected int Member_ID;
	protected String Name;
	protected String Branch;
	protected String Address;
	protected int Book_Limit;
	
     abstract void Request_Book(String string);
     abstract void Return_Book();
     abstract void Renew_Book();
     abstract void Enquiry();
    
	// String Return_Book();
     public Member(String name, String address, String branch,int booklimit){
    	Name = name;
 		Address = address;
 		Branch = branch;
 		Book_Limit = booklimit;
     }
}	