package eclipseDemo;

public class TestStaticMethodOverloading {

	public static void main(String[] args) {
   System.out.println("Hi All");
   TestStaticMethodOverloading.main("Jspiders");
	}
	public static void main(String s1) {
		System.out.println("Welcome to"+" "+s1);
		TestStaticMethodOverloading.main("java", "class");
	}
	public static void main(String s1,String s2) {
		System.out.println("This is"+" "+s1+" "+s2);
		
	}

}
