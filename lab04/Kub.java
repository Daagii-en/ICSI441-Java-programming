package basic;

public class Kub extends Durs{
	private final int a, b, c;
	Kub(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getArea(){
		 double s = (a + b + c) / 2;
		 return  Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
	}
  public void setArea(int a, int b, int c) {
      double s = (a + b + c) / 2;
      s = Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }
  public void printinfo(int a) {
		System.out.println("kubiin tal ni :"+a);
	}
    public double perimeter() {
        // P = a + b + c
        return a + b + c;
    }
}
