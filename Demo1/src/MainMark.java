import java.util.Scanner;
class MainMark{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the three subject marks of a student");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
 
if(x>=85&&y>=85&&z>=85)
System.out.println("result:pass with distinction");
else if((x<85&&x>=60)||(y<85&&y>=60)||(z<85&&z>=60))
System.out.println("result:pass with first class");
else if((x<60&&x>=50)||(y<60&&y>=50)||(z<60&&z>=50))
System.out.println("result:pass with second class");
else if((x<50&&x>=35)||(y<50&&y>=35)||(z<50&&z>=35))
System.out.println("result:pass");
else
System.out.println("result:Fail");
}
}

