package b1;

public class bodlogo4 {

	public static void main(String[] args){
	
		String uguulegdehuun[] = {"bat","bold","naran"};
		String tusagdahuun[] = {"hicheel", "nom", "dugui"};
		String uguulhuun[] = {"hiisen ", "unshsan ","unsan "};
		
		int random =0;
		if(Math.random()>0.5)
			random =1;
		else
			random =0;
		switch(random) {
		case 0:
			System.out.println(uguulegdehuun[random]+" "+tusagdahuun[random]+" "+uguulhuun[random]+".");
			break;
		case 1: 
			System.out.println(uguulegdehuun[random]+" "+tusagdahuun[random]+" "+uguulhuun[random]+".");
            break;
        default:
			System.out.println(uguulegdehuun[random]+" "+tusagdahuun[random]+" "+uguulhuun[random]+".");
		}
	}
}