package eclipseDemo;
import java.util.Scanner;
public class Xylem {
		public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value you have to check");
	    int n=sc.nextInt();
		int os=0,ms=0,temp=n;
		do{
		int d=n%10;
		if(temp==n||d==n) 
		os=os+d;
		else {
		ms=ms+d;
		n=n/10;
		}
		}while(n!=0);
		
		if (ms==os)
			System.out.println("xylem"); 
		else 
			System.out.println("phloem");
		
		}
		}

