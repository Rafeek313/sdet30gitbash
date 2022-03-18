
package eclipseDemo;

import java.util.Scanner;

public class Anagram {
	static int[]countfreq(String st){
		int count[]=new int[26];
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='A'&& ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count[ch-97]++;
			
		}
		return count;
		
	}

	static boolean isAnagram(String st1,String st2) {
		int c1[]=countfreq(st1);
		int c2[]=countfreq(st2);
		for(int i=0;i<26;i++) {
			if(c1[i]!=c2[i])
				return false;
		
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two string");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean rs= isAnagram(s1, s2) ;
		if(rs==true)
			
			System.out.println("string is anagram");
			else
				System.out.println("string is not anagram");
		}

		

	}


