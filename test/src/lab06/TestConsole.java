package lab06;

import java.util.ArrayList;

//import java.util.Scanner;

public class TestConsole {

	public static void main(String args[]){
		
		Bill bill = new Bill();
		Transaction t = new Transaction();
		
		ArrayList<Librarian> l = new ArrayList<Librarian>();
	    l.add(new Librarian("Naraa","admin","Ulaanbaatar"));
	    System.out.println(l);
	    ArrayList<Student> stud = new ArrayList<Student>();
	    stud.add(new Student("Naraa", "ULAANBAATAR", "HSHUIS",2019,3));
		System.out.println(stud);
		
		
		
		
		//Member stud = new Student("Naraa", "ULAANBAATAR", "HSHUIS");
		//Book book = new Magzines("Java", "Enkhzol", 10000);
		//Librarian l = new Librarian("bat","asdfghjkl","BZD");
		
		//Non_Teaching_Staff n = new Non_Teaching_Staff();
		//Reference_Books r = new Reference_Books();
		
		
		//bill.Bill();
		
		//l.getName();
//		System.out.println("Student name: "+stud.Name+"\n"+"Student address:"+stud.Address
//				+ "Branch: "+ stud.Branch);
//		System.out.println(book.Name+" "+ book.Author+" "+book.Price + " "+ book.Publisher 
//				);
//		System.out.println(bill);
//
//		Scanner e = new Scanner(System.in);
//		System.out.println("Books: ");
		
		
		
		
		
		
		
		
	
		
		/*stud.Request_Book("daagii");*/
		//System.out.println("Student name:"+ e);
        //bill.Create_Bill(1);
//	     l.setName("Saraa");
//	     l.setAddress("BZD");
//	     System.out.println(l);
//	     book.Display("Dev C");
//		
	    
		//Librarian librarian = new Librarian();
		//Pay_Fine("Davaajargal");
		//String names = stud.nextLine();
		//System.out.println(getYear(2002));
	}
}
