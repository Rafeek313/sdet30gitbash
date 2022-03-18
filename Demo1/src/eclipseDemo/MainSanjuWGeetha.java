package eclipseDemo;

import java.util.Scanner;

public class MainSanjuWGeetha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer number");
		int n=sc.nextInt();
		if(n%3==0&&n%5==0)
			System.out.println("sanju weds geetha");
		else if(n%5==0)
			System.out.println("geetha");
		else if(n%3==0)
			System.out.println("sanju");
		else 
			System.out.println("breakup");
	}

}
