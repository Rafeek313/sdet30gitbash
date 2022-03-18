package eclipseDemo;

import java.util.Scanner;

public class MainMonthSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a month no");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("jan");
			break;
		case 2:
			System.out.println("feb");
		case 3:
			System.out.println("mar");
		case 4:
			System.out.println("apr");
		case 5:
			System.out.println("may");
		case 6:
			System.out.println("june");
		case 7:
			System.out.println("july");
		case 8:
			System.out.println("August");
		case 9:
			System.out.println("sep");
		case 10:
			System.out.println("oct");
		case 11:
			System.out.println("nov");
		case 12:
			System.out.println("dec");
		break;
		default:
			System.out.println("invalid month");
		}

	}

}
