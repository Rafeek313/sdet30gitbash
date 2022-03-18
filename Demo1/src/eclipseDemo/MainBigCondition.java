package eclipseDemo;

import java.util.Scanner;

public class MainBigCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		//int big=(x>y)?x:y;
		//big=(big>z)?big:z;
		int big=(x>y&&x>z)?x:(y>z)?y:z;
		System.out.println(big+" is big");

	}

}
