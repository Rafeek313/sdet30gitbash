package eclipseDemo;

public class Rectangle extends Shape {
	@Override
	void area() {
		int l=10;
		int b=20;
		int a=l*b;
		super.area();
		System.out.println(a);
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.area();

	}

	

}
