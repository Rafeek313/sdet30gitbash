package eclipseDemo;

import java.util.Scanner;

public class MainStrSpecial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = sc.nextLine();
		int dc=countSpecial(str);
		System.out.println(dc);
				
	}
  static int  countSpecial(String str) {
	  int count=0;
	  for(int i=0;i<str.length();i++)
	  {
		  char ch = str.charAt(i);
		  //if(ch>=0&&ch<=47||ch>=58&&ch<=64||ch>=91&&ch<=96||ch>=122)
		  if(Character.isLetterOrDigit(ch)==false)
			  count++;
	  }
	  return count;
  }
}
