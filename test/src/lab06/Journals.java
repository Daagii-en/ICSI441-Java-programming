package lab06;

public class Journals extends Book{
	
	private int volume;
	
	public Journals(int bookid, String name, String author, String publisher, int price, int volume) {
		super(bookid, name, author, publisher, price);
		// TODO Auto-generated constructor stub
		this.volume = volume;
	}

	
	
	
	public int getVolume(){
		return volume;
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Journals name: "+ Name+ " author: "+ Author);
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println("Journals price: "+ Price);
	}
	
}