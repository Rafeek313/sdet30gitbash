package eclipseDemo;

import java.util.*;

public class DemoSet {

	public static void main(String[] args) {
		Set<String> rcb=new HashSet<>();
		rcb.add("kohli"); rcb.add("maxwell");
		rcb.add("siraj"); rcb.add("chahal");
		rcb.add("kohli"); rcb.add(null);
		System.out.println(rcb);
		Set<String> csk=new LinkedHashSet<>();
		csk.add("dhoni"); csk.add(null);
		csk.add("jadeja"); csk.add("jadeja");
		csk.add("bravo"); csk.add("duplesis");
		csk.add(null);
		System.out.println(csk);
		TreeSet<String> dc=new TreeSet<>();
		dc.add("pant"); 
		dc.add("iyer"); dc.add("hetmeyr");
		dc.add("rabada"); dc.add("pant");
		System.out.println(dc);
		
		TreeSet<String> ts=new TreeSet<>(Collections.reverseOrder());
		ts.add("pant"); 
		ts.add("iyer"); ts.add("hetmeyr");
		ts.add("rabada"); ts.add("pant");
		System.out.println(ts);

	}

}
