import java.util.Scanner;

public class Panagram {
	static boolean isPanagram(String st) {
		st=st.toUpperCase();
		for(char ch='A';ch<='Z';ch++) {
			if(st.indexOf(ch)==-1)
				return false;
	}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
	boolean rs=isPanagram(s1) ;
		if(rs==true) 
			System.out.println("string is panagram");
		else
			System.out.println("string is not panagram");
	}
		

	}


