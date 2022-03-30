package lab06;

import java.util.Date;

public class Transaction{
	private int ID;
	private int Member_ID;
	private int Book_ID;
	private Date Issue_Date;
	private Date Due_Date;
	
	public String Cearte_Transaction(){
		// int transaction = Member_ID ;
		return null;
	}
	public void Delete_Transaction(){
		System.out.println("Delete transaction: "+Book_ID);
	}
	public void Display_Transaction(){
		System.out.println("Issue date:"+ Issue_Date + "Due_Date: "+ Due_Date);
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getMember_ID() {
		return Member_ID;
	}
	public void setMember_ID(int member_ID) {
		Member_ID = member_ID;
	}
}
