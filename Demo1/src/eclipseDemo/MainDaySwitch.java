package eclipseDemo;
import java.util.Scanner;
public class MainDaySwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the day no");
        int n=sc.nextInt();
        switch(n)
        {
        case 1:
        	System.out.println("Monday");
        	break;
        case 2:
        	System.out.println("Tuesday");
        	break;
        case 3:
        	System.out.println("wednesday");
        	break;
        case 4:
        	System.out.println("Thursday");
        	break;
        case 5:
        	System.out.println("friday");
        	break;
        case 6:
        	System.out.println("Saturdayday");
        	break;
        case 7:
        	System.out.println("sunday");
        	break;
        	default:
        		System.out.println("invalid day");
        }
	}

}
