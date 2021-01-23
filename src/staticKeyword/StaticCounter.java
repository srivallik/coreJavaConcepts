package staticKeyword;

public class StaticCounter {

	static int count = 0;// will get memory only once and retain its value

	StaticCounter() {

		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {

		StaticCounter sc = new StaticCounter();
		StaticCounter sc2 = new StaticCounter();
		StaticCounter sc3 = new StaticCounter();

	}

}
