package basic;

public class Dugui extends Durs{
	
	// dahin todorhoilson baiguulagch method 
	private final double r;
    final double pi = Math.PI;
	Dugui(int r){
		this.r = r;
	}
	// dahin todorhoilson method
	public double getArea() {
		return r*r*pi; 
	}
	public void setArea(double r){
	}
	public double perimeter() {
        // P = 2πr
        return 2 * pi * r;
    }
    public void printinfo(int r) {
    	System.out.println("dugui dursnii diametr: " + r);
	}
}
