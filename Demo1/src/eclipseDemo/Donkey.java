package eclipseDemo;
public class Donkey extends Animall {

	public static void main(String[] args) {
		Donkey d=new Donkey();
		d.eat();
		d.walk();
		Animall a=new Donkey();
		a.eat();
	}

	@Override
	void eat() {
		System.out.println("donkey eat poop");
		
	}

}
