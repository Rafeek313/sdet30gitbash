package eclipseDemo;

import java.util.*;

public class ListItrDemo {

	public static void main(String[] args) {
		List<String> lst=new LinkedList<>();
		lst.add("red"); lst.add("black");
		lst.add("blue"); lst.add("brown");
		lst.add("orange"); lst.add(2, "pink");
		ListIterator<String> ls=lst.listIterator();
		while(ls.hasNext()) {
			String ele = ls.next();
			System.out.print(ele+" ");
			
		}
		System.out.println(ls.previousIndex());
		System.out.println(ls.nextIndex());
		while(ls.hasPrevious()) {
			String ele = ls.previous();
			System.out.print(ele+" ");
		}

	}

}
