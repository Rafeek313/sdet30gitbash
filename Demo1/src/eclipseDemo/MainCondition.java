package eclipseDemo;

import java.util.Scanner;

public class MainCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		int n=sc.nextInt();
		String st=(n%2==0)?"even":"odd";
		System.out.println(n+ "is "+st);

	}

}
