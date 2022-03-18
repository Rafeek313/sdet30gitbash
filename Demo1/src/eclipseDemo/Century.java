package eclipseDemo;

import java.util.Scanner;

public class Century {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value you have to check");
		int n=sc.nextInt();
		if(n>=1&&n<=100)
			System.out.println(n/100+1);
		else if(n>100) {
			if(n%100==0)
				System.out.println(n/100);
			else {
				System.out.println(n/100+1);
			}
		}
		else
		{
			System.out.println("zero and negative value is not taking");
		}
	}

}
