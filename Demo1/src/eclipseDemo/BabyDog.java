package eclipseDemo;

public class BabyDog extends Dog{
  void weep() {
	  System.out.println("weeping");
  }
	public static void main(String[] args) {
		BabyDog b=new BabyDog();
		b.bark();
		b.eat();
		b.weep();
		Dog d=new Dog();
		d.bark();
		d.eat();
		Animal a=new Animal();
		  a.eat();

	}

}
