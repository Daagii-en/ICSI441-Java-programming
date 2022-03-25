package basic;

public class TegshUntsugt extends Durs {

	private final int a, b;
    TegshUntsugt(int a, int b){
		this.a = a;
		this.b = b;
	}
	public double getArea(){
		 return  a*b;	
	}
	public void setArea(int a , int b) {
	    
    }
	public void printinfo(int a) {
		System.out.println("tegsh untsugtiin talbai ni : a" );
	}
    public int perimeter() {
        // P = (a + b )*2
        return (a + b)*2;
    }
}
