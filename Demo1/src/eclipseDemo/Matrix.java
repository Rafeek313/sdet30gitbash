package eclipseDemo;
import java.util.Scanner;

public class Matrix {
 int[][]readMat(){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the size of row and column: ");
	 int row=sc.nextInt();
	 int col=sc.nextInt();
	 System.out.println("enter "+row*col+" element as row wise");
	 int mat[][]=new int[row][col];
	 for(int i=0;i<mat.length;i++) {
		 for(int j=0;j<mat[i].length;j++) {
			 mat[i][j]=sc.nextInt();
		 }
	 }
	return mat;
 } 
 
 void displayMat(int[][]mat) {
	 for(int i=0;i<mat.length;i++) {
		 for(int j=0;j<mat[i].length;j++) {
			 System.out.print(mat[i][j]+" ");
}
		 System.out.println();
}
 }
int sumOfMat(int[]mat[]) {
	int sum=0;
	for(int i=0;i<mat.length;i++) {
		for(int j=0;j<mat[i].length;j++) {
			sum=sum+mat[i][j];
		}
	}
	return sum;
}
int bigMatrix(int[][]mat){
int big=0;
for(int i=0;i<mat.length;i++) {
	for(int j=0;j<mat[i].length;j++) {
		if(mat[i][j]>big)
			big=mat[i][j];
	}
	}
return big;
}
int smallMatrix(int[][]mat){
int small=Integer.MAX_VALUE;
for(int i=0;i<mat.length;i++) {
	for(int j=0;j<mat[i].length;j++) {
		if(mat[i][j]<small)
			small=mat[i][j];
	}
	}
return small;
}
	
void evenMatrix(int[][]mat){
	int ecount=0;
	int ocount=0;
for(int i=0;i<mat.length;i++) {
	for(int j=0;j<mat[i].length;j++) {
		if(mat[i][j]%2==0)
			ecount++;
		else
			ocount++;
			
	}
	}
System.out.println("total even no. of the matrix is: "+ecount);
System.out.println("total even no. of the matrix is: "+ocount);
int[] count= {ecount,ocount};


}
}
