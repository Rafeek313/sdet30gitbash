package eclipseDemo;
import java.util.Scanner;
class PrimeNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you have to check");
		int n=sc.nextInt();//150
		int i=0; int num=0;
		String prime="";
		for(i=1;i<=n;i++) {
			int count=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)//1%150=1
					count++;
			}

			if(count==2) {
				prime=prime+i+" ";

			}

		}
		System.out.println("prime numbers from 1 to"+n+" are");
		System.out.println(prime+" ");
	}
}
