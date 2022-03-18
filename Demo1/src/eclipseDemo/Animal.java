package eclipseDemo;

public class Animal {
void eat() {
	System.out.println("eating");
}
public static void main(String[] args) {
	Animal d=new Dog();
	d.eat();
	Animal c=new Cat();
	c.eat();
}
}
