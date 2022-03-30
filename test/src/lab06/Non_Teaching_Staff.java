package lab06;

public class Non_Teaching_Staff extends Member{
	private String designation;

	public Non_Teaching_Staff(String name, String branch, String address, int bookLimit, String designation) {
		super(name, branch, address, bookLimit);
		this.designation = designation;
	}
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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

	@Override
	void Request_Book(String string) {
		// TODO Auto-generated method stub
		
	}
	
}