package eclipseDemo;

public class ZigZagArray {

	public static void main(String[] args) {
		int ar[]= {45,67,87,98,58};
		int br[]= {11,22,33};
		int c[]=zigZag(ar,br);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}
static int[] zigZag(int x[],int y[]){
	int z[]=new int[x.length+y.length];
	int i=0,j=0;
	while(i<x.length&&i<y.length) {
		z[j]=x[i];
		j++;
		z[j]=y[i];
		j++;
		i++;
	}
	while(i<x.length) {
		z[j]=x[i];
		j++;
		i++;
	}
	while(i<y.length) {
		z[j]=y[i];
		j++;
		i++;
	}
	return z;
}
}
