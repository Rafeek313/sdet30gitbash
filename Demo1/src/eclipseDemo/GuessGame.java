package eclipseDemo;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int count=0;
		while(true) {
		System.out.println("enter the no.in b/w 0 to 9");
		int n=sc.nextInt();
		int rd=r.nextInt(10);
		
			
		count++;
		if(rd==n)
			break;
		else
			System.out.println("sorry no.was"+rd);
		}
		System.out.println("you won the game you have taken"+count+"chances");
		}


}
