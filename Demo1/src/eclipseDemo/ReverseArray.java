package eclipseDemo;

public class ReverseArray {

	public static void main(String[] args) {
		int ar[]= {23,56,78,45,32};
		reverse(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}

	}
static void reverse(int x[]) {
	for(int i=0;i<x.length/2;i++) {
		int t=x[i];
		x[i]=x[x.length-1-i];
		x[x.length-1-i]=t;
	}
	
	}
}
