package eclipseDemo;

import java.util.Scanner;

public class MainDate {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the date you have to check");
	int dd=sc.nextInt();
	int mm=sc.nextInt();
	int yy=sc.nextInt();
	if(dd<0||mm<0||dd>31||mm>12)
	System.out.println("the given date is invalid");
	else if((mm==4||mm==6||mm==9||mm==11)&&dd>30)
	System.out.println("the given date is invalid");
	else if(mm==2 &&(yy%4==0 && yy%100!=0 || yy%400==0) && dd>28)
	System.out.println("the given date is invalid");
	else if(mm==2 &&(yy%4==0 && yy%100!=0 || yy%400==0) && dd>29)
	System.out.println("the given date is invalid");
	else
	System.out.println("the date is valid");
	}
	}
