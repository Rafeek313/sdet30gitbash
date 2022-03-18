package eclipseDemo;

import java.util.Scanner;

public class IfSample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
	float num = sc.nextFloat();
		if (num<0) {
			System.out.println("the number is negative");
		}
		else {
			System.out.println("the number is positive");
		}

	}

}
