package thisKeyword;

public class Example1 {

	Example1() {
	
		this(100);
		System.out.println("Default Constructor");
		
	}
	
	Example1(int id){
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		Example1 e=new Example1();
		

	}

}
