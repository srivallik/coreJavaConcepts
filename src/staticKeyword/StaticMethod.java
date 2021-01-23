package staticKeyword;

public class StaticMethod {

	String occup;
	int exp;
	static String name = "Chinna";

	static void change() {
		name = "Veera Bhadra Rao";

	}

	StaticMethod(String occup, int exp) {

		this.occup = occup;
		this.exp = exp;

	}

	void display() {
		System.out.println(occup + " " + exp + " " + name);
	}

	public static void main(String[] args) {
		StaticMethod sm = new StaticMethod("Farmer", 40);
		change();
		sm.display();

	}

}
