package lab06;
/*
 * member class аас удамшисан Student class
 */
public class Student extends Member{
	// Class iin field uud
    private	int Year;
	private int Roll_No;
	//Class iin method uud
	public void Pay_Fine(String name){
		System.out.println(name+"oyutnii tulbur: ");
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
	// abstract class iin Override hiigdsen method uud
	@Override
	void Request_Book() {
		// TODO Auto-generated method stub
		//String name;
		System.out.println("Request book: ");
	}
	@Override
	void Return_Book() {
		// TODO Auto-generated method stub
		System.out.println("Return book: ");
	}
	@Override
	void Renew_Book() {
		// TODO Auto-generated method stub
		System.out.println("");
	}
	@Override
	void Enquiry() {
		// TODO Auto-generated method stub
		System.out.println(" ");
	}
}
