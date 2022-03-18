package eclipseDemo;

public class AccDetials {
	long accnumber;
	double balance;
	String name;
	
public AccDetials(long accnumber,double balance,String name) {
	this. accnumber=accnumber;
	this. balance=balance;
	this. name=name;
}
public AccDetials(long accnumber) {
	this. accnumber=accnumber;
}
public AccDetials() {
	this. accnumber=accnumber;
}
	public static void main(String[] args) {
		AccDetials ac1=new AccDetials();
		ac1.accnumber=2019207121;
		ac1.balance=100000.23;
		ac1.name="Rafeek";
		System.out.println(ac1.accnumber+" "+ac1.balance+" "+ac1.name);
		AccDetials ac2=new AccDetials(1234567890);
		ac2.balance=5000;
		ac2.name="rizwan";
		System.out.println(ac2.accnumber+" "+ac2.balance+" "+ac2.name);
		AccDetials ac3=new AccDetials(987654321,1234567.87,"sareef");
		System.out.println(ac3.accnumber+" "+ac3.balance+" "+ac3.name);
		
	}

}
