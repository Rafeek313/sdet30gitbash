package eclipseDemo;

public class AdditionMO {
	void add() {
		int a=20;
		int b = 10;
		int c=a+b;
		System.out.println(c);//30
		
	}
	void add(int a) {
		 int b = 10;
		int c=a+b;
		System.out.println(c);//11
		
	}
	void add(int a,int b) {
		int c = a+b;
		System.out.println(c);//3

		
	}
	void add(int a,int b,int c) {
		int d = a+b+c;
		System.out.println(d);//6

	}
	void add(double a,float b) {
		 double c = a+b;
			System.out.println(c);//4.3

	}

	public static void main(String[] args) {
		
		AdditionMO a=new AdditionMO();
		a.add();
		a.add(1);
		a.add(1, 2);
		a.add(1,2,3);
		a.add(1.7, 2.6f);
	}

}
