package eclipseDemo;

public class MergeSorted {

	public static void main(String[] args) {
		int ar[]= {27,56,78,89,92};
		int br[]= {11,22,33};
		int cr[]=mergeSorted(ar,br);
		for(int i=0;i<cr.length;i++) {
			System.out.print(cr[i]+" ");
		}
	}	

	static int[] mergeSorted(int x[],int y[]) {
		int i=0,j=0,k=0;
		int z[]=new int[x.length+y.length];
		while(i<x.length && j<y.length) {
		if(x[i]<y[j]) {
			z[k]=x[i];
			i++;
		}
		else {
			z[k]=y[j];
			j++;
		}
		k++;
		}
	while(i<x.length) {
		z[k]=x[i];
		i++;
		k++;
	}
	while(i<y.length) {
		z[k]=y[j];
		j++;
		k++;
}
	return z;
	}
}
