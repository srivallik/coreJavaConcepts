
public class MethodOverloadingEX {
	
	static int add(int a,int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	static int add(int a,int b,int c) {
		System.out.println(a+b+c);
		return a+b+c;
	}

}
