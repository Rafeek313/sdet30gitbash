package eclipseDemo;


public class MultiplicationMo {
		void multiply() {
			int a=20;
			int b = 10;
			int c=a*b;
			System.out.println(c);//200
			
		}
		 void multiply(int a) {
			 int b = 10;
			int c=a*b;
			System.out.println(c);//10
			
			
		}
	
		void multiply(int a,int b) {
			int c = a*b;
			System.out.println(c);//2

			
		}
		void multiply(int a,int b,int c) {
			int d = a*b*c;
			System.out.println(d);//6

		}
		void multiply(double a,float b) {
			 double c = a*b;
				System.out.println(c);//4.3

		}

		public void main(String[] args) {
			
			MultiplicationMo a=new MultiplicationMo();
			a.multiply();
			a.multiply(1);
			a.multiply(1, 2);
			a.multiply(1,2,3);
			a.multiply(1.7, 2.6f);
			
		}


	

	}
