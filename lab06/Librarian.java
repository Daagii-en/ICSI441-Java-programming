package lab06;

public class Librarian{
	private String Name;
	private String Password;
	private String Address;
	
	public Librarian(String name, String password, String address) {
	     Name = name;
	     Password = password;
	     Address = address;
	}
	public void Issues_Book(String Name, String Address){
		System.out.println("Номын санч: "+ Name+"Гэрийн хаяг:"+Address);
	}
	public String Return_Book(String bookname){
		return bookname;
		
	}
	public void Maintain_Records(String sname, String bookname){
		System.out.println("Оюутан: "+ sname +bookname + "ном авсан.");
	}
	public void Member_registraion(){
		
	}
	public void Renew_Book(String bookname){
		System.out.println("Renew book: "+ bookname);
	}
	public void Collect_Fine(){
		System.out.println("Collect fine: ");
	}
	public void Search(String book){
		System.out.println("Search book: "+ book);
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}