package eclipseDemo;

import java.util.Scanner;

public class MonthNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the four subject marks");
		int w=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int total=w+x+y+z;
		System.out.println("total marks"+total);
		if(w<35||x<35||y<35||z<35)
			System.out.println("fail");
		else {
			if((w>=35&&w<=50)||(x>=35&&x<=50)||(y>=35&&y<=50)||(z>=35&&z<=50))
				System.out.println("pass");
			else if((w>50&&w<=60)||(x>50&&x<=60)||(y>50&&y<=60)||(z>=35&&z<=60))
				System.out.println("second class");
			else if((w>60&&w<=80)||(x>60&&x<=80)||(y>60&&y<=80)||(z>60&&z<=80))
				System.out.println("first class");
			else if((w>=80)||(x>=80)||(y>=80)||(z>=80))
				System.out.println("first class");
		}

	}

}
