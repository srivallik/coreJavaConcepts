package abstractClass;

public abstract class TwoWheeler {
	
	abstract void run();
	
	void stop() {
		System.out.println("Stopped!!");
	}
	
	static void gearMethod() {
		System.out.println("I am static method");
	}
	
	TwoWheeler(){
		System.out.println("Parent class Constructor!!");
	}

}
