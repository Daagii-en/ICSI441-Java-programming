package lab06;
//import java.util.*;
public class Student extends Member{
    private	int Year;
	private int Roll_No;
	
	public Student(String name, String address, String branch,int booklimit,int year) {
		super(name, address, branch, booklimit);
		this.Year = year;
	}
	public void Pay_Fine(String name){
		System.out.println(name+"сурагч"+"торгууль төлөх: ");
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	
	void Request_Book(String n) {
		// TODO Auto-generated method stub
		//String name;
		System.out.println("Request book: "+n);
	}
	@Override
	void Return_Book() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void Renew_Book() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void Enquiry() {
		// TODO Auto-generated method stub
		
	}
}
