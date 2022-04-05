package lab06;

public class New_Papers extends Book{

	private int Bill;
	
	public New_Papers(int bookid,String name, String author, String publisher, int price, int bill) {
		super(bookid, name, author, publisher, price);
		this.Bill= bill;
	}
	public int CalculateBill(){
		return 0;
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("New-papers name: "+ Name);
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		Bill = 4049523;
		System.out.println("update bill: "+ Bill);
	}
	
}
