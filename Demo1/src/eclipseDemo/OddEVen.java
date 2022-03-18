package eclipseDemo;
import java.util.Scanner;
	class OddEven{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter siize");
	    int n=sc.nextInt();
	    int ar[]=new int[n];
	    for(int i=0;i<n;i++) {
	    	ar[i]=sc.nextInt();
	    }
	    int res[]=Evod(ar);
	    System.out.println("even count"+res[0]);
	    System.out.println("odd count"+res[1]);
	    	
	    }
	    static int[] Evod(int ar[]){
		int ec=0,oc=0;
		int c[]=new int[2];
		
	for(int i=0;i<ar.length;i++){
	if(ar[i]%2==0)
	ec++;
	else
	oc++;
	c[0]=ec;
	c[1]=oc;
	}
return c;
	}
}
