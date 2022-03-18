package eclipseDemo;
import java.util.*;
public class MainMat {
	void transposeMatrix(int mat[][]){
		int [][]tm=new int[mat[0].length][mat.length];
	for(int i=0;i<mat.length;i++) {
		for (int j=0;j<mat.length;j++) {
			tm[i][j]=mat[j][i];
			System.out.print(tm[i][j]+" ");
		}
		System.out.println();
	}
	}
	void diagonalWiseBig(int mat[][]){
		int pbig=mat[0][0],sbig=mat[0][mat.length-1];
		for(int i=1;i<mat.length;i++) {
			if(mat[i][i]>pbig)
				pbig=mat[i][i];
			System.out.println(pbig);
			if(mat[i][mat.length-1-i]>sbig)
				sbig=mat[i][mat.length-1-i];
			System.out.println(sbig);
		}
	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return toString();
	}
	public static void main(String[] args) {
		Matrix m1=new Matrix();
		System.out.println("read matrix:");
		int m[][]=m1.readMat();
		System.out.println("user entered matrix: ");
		m1.displayMat(m);
		System.out.println("sum of the matrix elements: "+m1.sumOfMat(m));
System.out.println("biggest element in the matrix:"+m1.bigMatrix(m));
System.out.println("smallest element of the matrix is:"+m1.smallMatrix(m));
m1.evenMatrix(m);
MainMat m2=new MainMat();
m2.transposeMatrix(m);
m2.diagonalWiseBig(m);

	}
}