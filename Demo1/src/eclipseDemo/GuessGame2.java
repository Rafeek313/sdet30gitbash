package eclipseDemo;

	import java.util.Random;
	import java.util.Scanner;

	public class GuessGame2 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Random r=new Random();
			int rd=r.nextInt(10);
			int count=0;
			while(count<3) {
			System.out.println("enter the no.in b/w 0 to 9");
			int n=sc.nextInt();
			count++;
			if(rd==n)
			{
				System.out.println("you won the game");
				return;
			}
			else if(n<rd)
				System.out.println("the no.is greater than this");
			else
				System.out.println("the no.is lesser than this");
			}
			
			}
}
