package eclipseDemo;

public class A {
	int a;
	A(){
		System.out.println("it is a constructor of A");
	}
	A(int a){
		System.out.println("it is a argument constructor of A");
	}
	void display() {
		System.out.println("its A");
	}
	void display(int a) {
		System.out.println("it s argument of A");
	}
}
