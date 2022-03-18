package eclipseDemo;

import java.util.Scanner;

public class MainNegativeCond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer");
		int n=sc.nextInt();
		int res=n>0?n:n*-1;
		System.out.println(res);
	}

}
