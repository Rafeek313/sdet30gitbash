package eclipseDemo;

public class B extends A {
	B(){
		System.out.println("it is constructor b");
	}
	B(int a){
		a=30;
		super.a=50;
		int c=super.a+a;
		System.out.println(c);
		System.out.println("it is a argument constructor of b");
	}
void display() {
	super.display();
	System.out.println("its B");
}
void display(int a) {
	a=10;
	super.a=20;
	int c=a+super.a;
	System.out.println(c);
	System.out.println("it is argument B");
}
public static void main(String[] args) {
	//B b=new B();
	B b1=new B(10);
	//b.display();
	//b.display(10);
}
}
