package eclipseDemo;

import java.util.Scanner;
public class MergeArray
{
static int[] merge(int a[],int b[]){
int c[]=new int[a.length+b.length];
for(int i=0;i<a.length;i++){
c[i]=a[i];
}
for(int i=0;i<b.length;i++){
c[a.length+i]=b[i];
}
return c;
}
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter size of an array ");
int n1=s.nextInt();
int n2=s.nextInt();
int a[]=new int[n1];
int b[]=new int[n2];
System.out.println("Enter the"+n1+"integer");
for(int i=0;i<n1;i++){
a[i]=s.nextInt();
}
System.out.println("Enter the"+n2+"integer");
for(int i=0;i<n2;i++){
b[i]=s.nextInt();
}
int m[]=merge(a,b);
System.out.println("no.of prime numbers in this array ");
for(int i=0;i<m.length;i++) {
	System.out.print(m[i]+" ");
}
}
}
