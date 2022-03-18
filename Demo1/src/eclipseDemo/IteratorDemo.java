package eclipseDemo;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("red"); lhs.add("pink");
		lhs.add("blue"); lhs.add("black");
		lhs.add("yellow"); lhs.add("white");
		Iterator<String>itr=lhs.iterator();
		/*System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());*/
		//using while loop//
		while(itr.hasNext()) {
			String ele = itr.next();
			System.out.print(ele+" ");
		}

	}

}
