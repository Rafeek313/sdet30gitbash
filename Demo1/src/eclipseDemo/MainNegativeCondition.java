package eclipseDemo;

import java.util.Scanner;

public class MainNegativeCondition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer");
		int n=sc.nextInt();
		String res=n>0?"positive":"negative";
		System.out.println(n+"is a " +res);
	}
}
