package eclipseDemo;

import java.util.Scanner;

public class MainSwitchOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the integer you have to check");
		switch(n%2) {
		case 0:System.out.println("the given no.is even");
		case 1:System.out.println("the given no.is odd");

	}
	}

}
