package b1;

public class bodlogo3 {

	public static void main(String[] args){
		int mobicom = 99000000;
		int skytel = 96000000;
		int gmobile = 98000000;
		int m;
		m = (int) (Math.random()*100000);
		mobicom += m;
		int s;
		s = (int)(Math.random()*100000);
		skytel += s;
		int g;
		g = (int)(Math.random()*100000);
		gmobile += g;
		System.out.println("mobicom-iin dugaar: " + mobicom);
		System.out.println("skytel-iin dugaar: " + skytel);
		System.out.println("gmobile-iin dugaar: " + gmobile);
	}
}
