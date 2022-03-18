package eclipseDemo;

import java.util.Scanner;

public class Sample {
	int a;
	int b;
	void display() {
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
       int c=a+b;
       System.out.println("result:"+c);
	}
}
