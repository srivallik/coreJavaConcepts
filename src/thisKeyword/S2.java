package thisKeyword;

public class S2 {

	void m(S2 object) {
		
		System.out.println("method is invoked");
	}
	
	void p() {
		m(this);
	}
	
	public static void main(String args[]) {
	
	S2 obj=new S2();
	obj.p();
	
	
	}
	
}
