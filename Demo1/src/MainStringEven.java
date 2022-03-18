import java.util.Scanner;

public class MainStringEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer number");
		int n=sc.nextInt();
		String str[]={"even","odd"};
		System.out.println(n+"is "+str[n%2]);

	}

}
