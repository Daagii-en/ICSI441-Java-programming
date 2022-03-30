package test;
//Dog class extends Animal class
public class Dog extends test{

	   public void sound(){
		System.out.println("Woof");
	   }
	   public static void main(String args[]){
		test obj = new Dog();
		obj.sound();
	   }
}