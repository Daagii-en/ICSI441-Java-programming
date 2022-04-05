package lab06;

import java.util.Date;

public class Magzines extends Book{
	
	private int Issue_No;
	private Date Year;
	
    public Magzines(int bookid, String name, String author, String publisher, int price,int issueNo, Date year) {
    	super(bookid, name, author, publisher, price);
    	this.Issue_No= issueNo;
    	this.Year = year;
    }
	public void getIssueNo(){
		System.out.println("Issue_no: "+ Issue_No);
	}
	@Override
	public void Display(String name) {
		// TODO Auto-generated method stub
		System.out.println("Magzines publisher: "+Publisher+Year);
	}

	public void Update(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("Magzine name: "+ name);
	}
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		
	}
	
}
