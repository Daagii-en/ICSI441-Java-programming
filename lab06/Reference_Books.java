package lab06;

public class Reference_Books extends Book{

	private int Edition;
	private String ISBN;
	
	public Reference_Books(int bookid, String name, String author, String publisher, int price, int edition, String isbn){
		super(bookid, name, author, publisher, price);
		Edition = edition;
		ISBN = isbn;
	}
	public String getISBN(){
		return null;
	}

	public void Display(int Edition) {
		// TODO Auto-generated method stub
		System.out.println("Reference-book: "+ Edition+ ISBN);
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		Edition = Edition +1;
		System.out.println("Update-edition: "+ Edition);
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		
	}
	
}