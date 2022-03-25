package b1;

import java.util.Scanner;

public class bodlogo5 {

	private static boolean isPerfect(int m){
		int sum=0;
		for(int i=1; i<m; i++){
			if(m%i==0)
			    sum=sum+i;
		}
		if(sum==m)
			return true;
		else 
			return false;
	}
	public static void main(String[] args){
        int m;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Ta toogoo oruulna uu? ");
			m = in.nextInt();
	    System.out.println(m + " hurtel tugs toonuud: ");
	    for (int i=2; i<=m; i++){
				boolean x = isPerfect(i);
				if ( x == true)
					System.out.println(i);
		}
	}
}
