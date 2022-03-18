package eclipseDemo;
import java.util.Scanner;
public class MainTwoDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer number");
		int n=sc.nextInt();
		if((n>10||n<99)&&(n>-10&&n<-99)){
			System.out.println("the no.is two digit");	
		}
		else
			System.out.println("the no.is not two digit");
		
	}

}
