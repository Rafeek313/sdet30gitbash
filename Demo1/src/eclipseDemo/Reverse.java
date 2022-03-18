package eclipseDemo;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value");
		int n=sc.nextInt();//12345
		while(n!=0) {
			int d=n%10;
			System.out.print(d);
			n=n/10;
			
			
		}
	}

}
