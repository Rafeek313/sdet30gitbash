package eclipseDemo;

public class Circle extends Shape {
	@Override
	void area() {
		int r=10;
		double d=Math.PI*r*r;
		super.area();
	System.out.println(d);
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		c.area();

	}

	}


