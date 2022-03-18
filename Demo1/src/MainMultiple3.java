import java.util.Scanner;

public class MainMultiple3 {

	public static void main(String[] args) {
		System.out.println("enter the integer");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//for(int i=1;i<=n;i++)
		//{
		//	if(i%3==0)
		//	System.out.println(i);
		//}
		while(n>0) {
			if(n%3==0)
			System.out.println(n);
			n--;
		}
	}

}
