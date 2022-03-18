package eclipseDemo;

public class DemoConstructor {
	long accno; int cvv;
	long mobileno;
	public DemoConstructor(long accno,long mobileno,int cvv) {
		this.accno=accno;
		this.cvv=cvv;
		this.mobileno=mobileno;
	}
	public DemoConstructor(long accno) {
		this.accno=accno;
	}
	 public DemoConstructor(){
		
	}
	public static void main(String[] args) {
		DemoConstructor dc=new DemoConstructor();
		dc.accno=20192071211L;
		dc.mobileno=9483460652L;
		dc.cvv=123;
		System.out.println(dc.accno+" "+dc.cvv+" "+dc.mobileno);
		DemoConstructor dc1=new DemoConstructor(20192071212L);
		dc1.cvv=654;
		dc1.mobileno=9535388962L;
		System.out.println(dc1.accno+" "+dc1.cvv+" "+dc1.mobileno);
		DemoConstructor dc2=new DemoConstructor(20192071211L,9483460652L,123);
		System.out.println(dc2.accno+" "+dc2.cvv+" "+dc2.mobileno);
	}

}
