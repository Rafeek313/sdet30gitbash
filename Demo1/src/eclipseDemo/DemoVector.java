package eclipseDemo;
import java.util.*;
public class DemoVector {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<>();
		a.add("RR");
		a.add("KKr");
		a.add(100);
		a.add(null);
		Vector<Object> v1=new Vector(a);
		v1.add("rcb");
		v1.add("csk");
		v1.add("dc");
		v1.add(null);
		System.out.println(v1);
		
		
	}

}
