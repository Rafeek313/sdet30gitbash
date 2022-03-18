package eclipseDemo;

public class Cat extends Animal {
	void meow() {
		System.out.println("meowing");
	}

	@Override
	void eat() {
		System.out.println("cats eat rat");
		super.eat();
	}

	public static void main(String[] args) {
   Cat c=new Cat();
   c.meow();
   c.eat();
	}

}
