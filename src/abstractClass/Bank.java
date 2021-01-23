package abstractClass;

public abstract class Bank {
	
	 abstract int getRateOfInterest();
	 
	 final void deposit() {
		 System.out.println("final method in abstract method");
	 }

}
