package eclipseDemo;

import java.util.Scanner;

public class MainStrDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentences");
		String str = sc.nextLine();
		int dc = countDigitStr(str);
		System.out.println(dc);

	}

	 static int countDigitStr(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) 
				count++;
			
		}
		
		return count;
	}

}
