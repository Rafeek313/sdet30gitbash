package eclipseDemo;

import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three subject marks");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int avg=(a+b+c)/3;
		System.out.println(avg);
		if(a<35||b<35||c<35)
			System.out.println("fail");
		else if(avg>85)
			System.out.println("distinction");
		else if(avg>=60&&avg<=85)
			System.out.println("first class");
		else if(avg>=50&&avg<60)
			System.out.println("second class");
		else if(avg>=35&&avg<50)
			System.out.println("pass");
	}

}
