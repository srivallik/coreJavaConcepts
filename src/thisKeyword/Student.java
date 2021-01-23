package thisKeyword;

public class Student {
	
	String name;
	int rollno;
	float fee;
	
	Student(){
		System.out.println("I am a default constructor..invoked using this keyword");
	}

	
    Student(int marks){
    	this();
    	System.out.println("total marks: "+marks);
		
	}
	
	Student (String name, int rollno, float fee){
		this.name=name;
		this.rollno=rollno;
		this.fee=fee;
	}
	
	
	
	void display() {
		
		System.out.println(name  +"  "+ rollno+ "  " +fee);
	}
	
	void show() {
		this.display();
	}
	
	public static void main(String[] args) {
		
		Student s=new Student("Karthi",101,3000f);
		Student s2=new Student(90);
		Student s1=new Student("Papa",102,4000f);
		Student s3=new Student(95);
        s.show();
        s1.show();
	}

}
