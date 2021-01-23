package abstractClass;

public class Bike extends TwoWheeler{

	@Override
	void run() {
		System.out.println("Running!!");
		
	}
	public static void main(String args[]) {
	Bike b=new Bike();
	b.run();
	b.stop();
	TwoWheeler.gearMethod();
	
	}

}
