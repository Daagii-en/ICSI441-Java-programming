package lab06;

abstract class Book{
    protected int Book_ID;
    protected String Name;
    protected String Author;
    protected String Publisher;
    protected int Price;

    public abstract void Display();
	public abstract void Update();
	
}
