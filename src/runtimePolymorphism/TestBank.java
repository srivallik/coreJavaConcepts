package runtimePolymorphism;

public class TestBank {

	public static void main(String[] args) {
		
		Bank b;
		b=new CitiBank();
		System.out.println(b.getRateOfInterest());
        
		b=new ICICI();
		System.out.println(b.getRateOfInterest());
		
		b=new SBI();
		System.out.println(b.getRateOfInterest());
		
	}

}
