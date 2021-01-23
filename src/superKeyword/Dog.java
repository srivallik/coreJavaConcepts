package superKeyword;

public class Dog extends Animal{
	
	String color="White";
	
	Dog(){
		//super();
		System.out.println("child class constructor");
		
	}
	
	void printColor() {
		System.out.println(super.color);
		System.out.println(color);
		
	}
	
	void bark() {
		System.out.println("Barking!!");
		super.eat();
		
	}

}
