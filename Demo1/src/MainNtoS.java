import java.util.Scanner;

public class MainNtoS {
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		nw(no/10000000,"crores");
		nw(no/100000%100,"lakhs");
		nw(no/1000%100,"thousands");//854565443
		nw(no/100%10,"hundred");
		nw(no%100," ");

	}

   static void nw(int n, String st) {
	  String one[]= {" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
	  String two[]= {" "," ","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
	  if(n<20)
		  System.out.print(one[n]);
	  else
		  System.out.print(two[n/10]+one[n%10]);
	  if(n!=0)
		  System.out.print(st+" ");
		
		
	}

}
