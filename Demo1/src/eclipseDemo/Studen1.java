package eclipseDemo;

public class Studen1 {
	int id;
	static String sname;
	double perc;
	Studen1(){
		
	}
	  int study(int hours){
		 System.out.println("he is studying "+hours+" hours"); 
		  
		  return hours;
		
	 }
	 
	

	public static void main(String[] args) {
		Studen1 s=new Studen1();
		s.id=12248905;
		s.perc=64.63;
		Studen1.sname="rajish";
		s.study(4);
		System.out.println(s.id+" "+s.perc+" "+sname);

	}

}
