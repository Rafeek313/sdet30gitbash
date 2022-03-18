package eclipseDemo;

import java.util.Scanner;

public class MainMiddle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three integer value");
		int x=sc.nextInt();
		int z=sc.nextInt();
		int y=sc.nextInt();
		if(x>y&&x<z||x>z&&x<y)
			System.out.println("middle value is"+x);
		else if(y>x&&y<z||y>z&&y<x)
			System.out.println("middle value is"+y);
		else
			System.out.println("middle value is"+z);
		

	}

}
