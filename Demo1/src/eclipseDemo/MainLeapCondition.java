package eclipseDemo;

import java.util.Scanner;

public class MainLeapCondition {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
String st=(n%400==0||n%4==0&&n%100!=0)?"leapyear":"not a leap year";
System.out.println(n+"is "+st);
}
}
