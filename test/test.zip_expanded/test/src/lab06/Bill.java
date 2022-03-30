package lab06;

import java.util.Date;

public class Bill{//Ñ‚Ð¾Ð¾Ñ†Ð¾Ð¾Ð½Ñ‹ ÐºÐ»Ð°Ñ�Ñ�
	private int Bill_ID;
	private Date Date;
	private int Member_ID;
	private int Amount;
	
	public void Create_Bill(int Member_id){
		System.out.println(" : "+ Bill_ID);
		System.out.println(Date +" " + Member_ID+" "+Amount );
	}
	public void Update_Bill(){
		Date date = new Date();
		Date = date;
		System.out.println(Date);//--->
	}
}
