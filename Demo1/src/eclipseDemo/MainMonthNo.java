package eclipseDemo;

import java.util.Scanner;

public class MainMonthNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month no");
		int n=sc.nextInt();
		String st=(n<=12&&n>=1)?"valid":"not valid";
		System.out.println(n+" is "+st+" month no");
		
	}

}
