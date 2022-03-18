package eclipseDemo;

import java.util.Scanner;

public class Presentation2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer");
		int n=sc.nextInt();
		int sum=0;
		do {
			
			int d=n%10;
				sum=sum+d;
			n=n/100;
		}while(n!=0);
System.out.println(sum);
	}

}
