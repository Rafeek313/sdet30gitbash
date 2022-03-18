package eclipseDemo;

import java.util.Scanner;

public class MainBigAnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three integer");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if(x>y&&x>z)
			System.out.println(x+" isbig");
		else if (y>z)
			System.out.println(y+" is big");
		else
			System.out.println(z+" is big");


		
	}

}
