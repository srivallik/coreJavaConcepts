package staticKeyword;

public class StaticBlocks {
	
	static int a;
	static {
		a=10;
		System.out.println("static block is invoked " +a);
	}

	public static void main(String[] args) {
		
		System.out.println("Hello World");

	}

}
