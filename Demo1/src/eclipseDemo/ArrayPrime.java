package eclipseDemo;

import java.util.Scanner;
public class ArrayPrime
{
static int countPrime(int ar[]){
int count=0;
for(int i=0;i<ar.length;i++){
int n=ar[i];
int j=2;
while(j<=n/2){
if(n%j==0)
break;
j++;
}
if(j>n/2)
count++;
}
return count;
}
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter value you have to check");
int n=s.nextInt();
int arr[]=new int[n];
System.out.println("Enter the"+n+"integer");
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
int pc=countPrime(arr);
System.out.println("no.of prime numbers in this array "+pc);
}
}
