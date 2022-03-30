package lab06;

abstract class Book{
    protected int Book_ID;
    protected String Name;
    protected String Author;
    protected String Publisher;
    protected int Price;

    public abstract void Display();
	public abstract void Update();
	public void Display(String name) {
		// TODO Auto-generated method stub
		
	}
	public Book(int bookid,String name, String author, String publisher, int price) {
		Book_ID = bookid;
		Name = name;
		Author = author;
		Publisher = publisher;
		Price = price; 
	}
	
}
