package eclipseDemo;
//stack memoryil last kodtha value print aagum(b)
public class Hey {
int a;
static int b;
	public static void main(String[] args) {
		Hey h=new Hey();
		Hey h1=new Hey();
		h1.a=1500;
		b=230;
		h.a=100;
		h.b=270;// static variable having stack memory
		h1.b=1200;
		System.out.println(h.b);

	}

}
