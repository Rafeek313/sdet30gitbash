import java.util.Scanner;

public class MainFact {

	public static void main(String[] args) {
		System.out.println("enter the integer");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int fact=1;
		//while(n>1) {
		//	 fact=fact*n;
		//	n--;
		//}
		for(;n>=1;n--) {
			fact=fact*n;
		}
		System.out.println(fact);
		

	}

}
