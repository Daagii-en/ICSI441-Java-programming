package b1;

public class bodlogo2 {

	public static void main(String[] args){
		double dun[] = new double[10];
		double max = dun[0];
		for(int i=0; i<dun.length; i++){
			 dun[i] = (Math.random()*100);
		}
		
		for(int i=0; i<dun.length; i++){
			if(dun[i] > max){
				max = dun[i];
			}
		}
		System.out.println("hamgiin undur dun: " + max);
	}
}
