package basic;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("duguin radius iig oruulna uu: ");
			Dugui d= new Dugui(scan.nextInt());
			System.out.println("r radiustai duguin talbai: "+ d.getArea());
			System.out.println("kubiin taluud iig oruulna uu: ");
			Kub k = new Kub(scan.nextInt(),scan.nextInt(),scan.nextInt());
			System.out.println("kubiin perimeter : "+ k.perimeter());
			System.out.println("tegsh untsugtiin taluud iig oruulna uu: ");
			TegshUntsugt t = new TegshUntsugt(scan.nextInt(),scan.nextInt());
		    System.out.println("tegsh untsugtiin talbai : " + t.getArea());
		 
		}
		
	}
}
