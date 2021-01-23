package methodOverriding;

public class Bikes extends Vehicle{
	
	void run() {
		System.out.println("Bike is running...");
	}
	
	static void stop() {
		
		System.out.println("Bike is stopping...");
	}
    
	public static void main(String args[]) {
		Bikes b=new Bikes();
		b.run();
		Bikes.stop();
		
		Vehicle v=new Vehicle();
		v.run();
		Vehicle.stop();
	}
}
