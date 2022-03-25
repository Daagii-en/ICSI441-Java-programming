package b1;

public class bodlogo1 {

	public static void main(String[] args){
		/*
		 * arvan elementtei dun husnegt uusgeh.
		 */
		double dun[] = new double[10];
		double avg = 0;//dun giin dundaj hadgalah huvisagch
		/*
		 * Math.random() sanamsargui utga onooh.
		 */
		for(int i=0; i<dun.length; i++){
			 dun[i] = (Math.random()*100);
		}
		/*
		 * tuhain dungiin dundaj olj hevleh.
		 */
		for(int i=0; i<dun.length; i++){
			avg = avg + dun[i];
		}
		System.out.println("niit dungiin dundaj: " + avg/dun.length);
	}
}
