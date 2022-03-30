package lab06;

public class Journals extends Book{

	private int volume;
	
	public int getVolume(){
		return volume;
	}
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Journals name: "+ Name+ " author: "+ Author);
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println("Journals price: "+ Price);
	}
	
}