package eclipseDemo;

public class Son extends Father {

	@Override
	void drive() {
		System.out.println("he knows ridea bike");
		super.drive();
	}

	public static void main(String[] args) {
Son s= new Son();
s.drive();
//Father f=new Father();
//f.drive();
	}

}
