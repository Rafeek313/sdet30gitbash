package eclipseDemo;

public class AddSample {

	public static void main(String[] args) {
		int num1=100;
		int num2=200;
		int num3=300;
		int num4=400;
		Sum s=new Sum();
		s.total(num1, num2);
		s.display();
		s.total(num3, num4);
		s.display();
	}

}
