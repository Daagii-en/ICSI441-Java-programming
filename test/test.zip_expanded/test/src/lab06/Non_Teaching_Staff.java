package lab06;
/*
 * member abstract class aas udamshisan non_teaching_staff class
 */
public class Non_Teaching_Staff extends Member{
	//Field
	private String designation;
    //methods
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	void Request_Book() {
		// TODO Auto-generated method stub
		System.out.println("Request book:");
	}
	@Override
	void Return_Book() {
		// TODO Auto-generated method stub
		System.out.println("Return book:");
	}
	@Override
	void Renew_Book() {
		// TODO Auto-generated method stub
		System.out.println("renew book: ");
	}
	@Override
	void Enquiry() {
		// TODO Auto-generated method stub
		System.out.println("Enq");
	}
	
}