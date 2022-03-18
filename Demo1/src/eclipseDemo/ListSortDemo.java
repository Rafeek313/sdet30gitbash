package eclipseDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortDemo {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("red");
		lst.add("blue");
		lst.add("black");
		lst.add("pink");
		lst.add("white");
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println(lst);
		

	}

}
