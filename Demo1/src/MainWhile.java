import java.util.Scanner;

public class MainWhile {

	public static void main(String[] args) {
		System.out.println("enter the integer");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	while(n>0) {
		System.out.println(n);
		n--;
	}

	}

}
