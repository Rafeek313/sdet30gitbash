package eclipseDemo;


import java.util.*;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("orange");  lst.add("musambi");
		lst.add("pomogranate"); lst.add("sapota");
		lst.add("apple");  lst.add("mango");
		lst.add("guava");lst.add("guava");
		lst.add(null);lst.add(null);
		System.out.println(lst);
		List<String> ls=new LinkedList<>();
		ls.add("orange");  ls.add("musambi");
		ls.add("pomogranate"); ls.add("sapota");
		ls.add("apple");  ls.add("mango");
		ls.add("guava");ls.add("guava");
		ls.add(null);ls.add(null);
		System.out.println(ls);
		Collection<String> cl=new HashSet<>();
		cl.addAll(ls);
		cl.addAll(lst);
		System.out.println(cl);
		
	}

}
