package lab06;

/*
 * @author Davaajargal;
 * abstract member class  
 */
abstract class Member {

	protected int Member_ID;
	protected String Name;
	protected String Branch;
	protected String Address;
	protected int Book_Limit;
	
     abstract void Request_Book();
     abstract void Return_Book();
     abstract void Renew_Book();
     abstract void Enquiry();
    
}	