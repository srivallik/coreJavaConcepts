package thisKeyword;

public class Employee {
	
	int id;  
	String name,dept;  
	float fee; 
	
	Employee(int id,String name,String dept){  
	this.id=id;  
	this.name=name;  
	this.dept=dept;  
	} 
	
	Employee(int id,String name, String dept,float fee){
		
		this(id,name,dept);
		this.fee=fee;
		
	}
	
	void display() {
		System.out.println(id+" "+name+" "+dept+" "+fee);
	}
	
	public static void main(String args[]) {
		
		Employee e=new Employee(100,"Srivalli","Automation", 4000f);
		e.display();
		
	}

}
