package eclipseDemo;

public class Test {

	public static void main(String[] args) {
		System.out.println("main with String");
		Test t=new Test();
		t.main("rafeek");
		t.main();
	}
	public static void main(String args) {
		System.out.println("main with string");
	}
	
public static void main() {
	System.out.println("main without string");
	
}
}
