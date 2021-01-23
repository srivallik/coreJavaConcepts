package staticKeyword;

public class StudentEx {
	
	int rollno;
	static String collegeName="GITAMS";
	
	StudentEx(int rollno ) {
		
		this.rollno=rollno;
		
	}
	
	void show() {
		System.out.println(rollno+" "+collegeName);
	}
	
	public static void main(String args[]) {
		
		StudentEx s=new StudentEx(100);
		s.show();
		StudentEx s1=new StudentEx(101);
		s1.show();
	}
	

}
