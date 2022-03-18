package eclipseDemo;

public class Dog extends Animal {
	void bark() {
		System.out.println("barking");
	}

	@Override
	void eat() {
		System.out.println("dogs eats pedigree");
		super.eat();
	}

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.eat();
 // Animal a=new Animal();
  //a.eat();
 
  
	}
}