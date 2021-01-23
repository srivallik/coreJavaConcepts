package abstractClass;

public class TestBank {

	public static void main(String[] args) {
		
		Bank b;
		b=new SBI();
		System.out.println("rate of interest: "+b.getRateOfInterest());
		b.deposit();
		
		b=new Kotak();
		System.out.println("rate of interest: "+b.getRateOfInterest());
		b.deposit();

	}

}
