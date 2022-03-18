package eclipseDemo;

import java.util.*;

public class Caluclator {
 static void devide(int fn,int sn) {
	try {
		int res=fn/sn;
	 System.out.println("result= "+res);
 }
	catch (ArithmeticException ae) {
		ae.printStackTrace();
		System.out.println("enter proper input");
	}
 }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the fist number");
	int i=sc.nextInt();
	System.out.println("enter the second number");
	int j=sc.nextInt();
	sc.close();
	devide(i, j);//both are static
	

	}

}
