package eclipseDemo;

public class MainDates {

	public static void main(String[] args) {
Date d1=new Date(15,8,1947);
System.out.println(d1.noOfDays());
Date d2=new Date(8,11,2021);
System.out.println(d2.noOfDays());
System.out.println("no.of days b/w"+d1+"and"+d2+"is");
int total=d2.noOfDays()-d1.noOfDays();
System.out.println(total);
System.out.println(d1.getDayName());
System.out.println(d2.getDayName());
	}

}
