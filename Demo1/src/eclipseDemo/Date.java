package eclipseDemo;

public class Date {
	int mm,dd,yyyy;
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	String day[]= {"sunday","monday","Tuesday","wednesday","thursday","friday","saturday"};
	public   Date(int dd,int mm,int yyyy) {
		this.mm=mm;
		this.dd=dd;
		this.yyyy=yyyy;
		if(yyyy%4==0&&yyyy%100!=0||yyyy%400==0)
		month[2]=29;
	}
	public int noOfDays() {
		int count=dd;
		for(int i=1;i<mm;i++)
		count=count+month[i];
		int y=yyyy-1;
		count=count+y*365;
		count=count+y/4+y/400-y/100;
		return count;
	}
	public String getDayName() {
		int c=noOfDays();
		return day[c%7];
	}
	@Override
	public String toString() {
		return"["+dd+"/"+mm+"/"+yyyy+"]";
	}
}
