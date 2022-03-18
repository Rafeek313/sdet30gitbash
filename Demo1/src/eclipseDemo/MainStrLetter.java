package eclipseDemo;

import java.util.Scanner;

public class MainStrLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str = sc.nextLine();
		int uc=0,lc=0;
		
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='A'&&ch<='Z')
				uc++;
			if(ch>='a'&&ch<='z')
				lc++;
		}
		System.out.println("uppercase letter is:"+uc);
		System.out.println("lowercase letter is:"+lc);

	}

}
