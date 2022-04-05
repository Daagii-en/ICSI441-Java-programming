package lab06;

import java.util.Date;

public class Bill{
	private int Bill_ID;
	private Date Date;
	private int Member_ID;
	private int Amount;
	
    public  Bill(){
    	Bill_ID = 1;
    	//Date = ;
    	Member_ID =1;
    	Amount = 1;
    	}
	public void Create_Bill(int Member_id){
		System.out.println("Bill ID: "+ Bill_ID);
		System.out.println("Start date: " +Date);
		System.out.println("Member ID: " + Member_ID);
		System.out.println("Amount: "+Amount);
	}
	public void Update_Bill(){
		Date date = new Date();
		Date = date;
		System.out.println(Date);//--->
	}
}
