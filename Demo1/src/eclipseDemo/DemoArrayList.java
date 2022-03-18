package eclipseDemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DemoArrayList {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("red"); lhs.add("pink");
		lhs.add("blue"); lhs.add("black");
		lhs.add("yellow"); lhs.add("white");
		ArrayList<String> al=new ArrayList<>(lhs);
		//System.out.println(al);
		/*for(int i=0;i<al.size();i++) {
			String ele = al.get(i);
			System.out.print(ele+" ");
		}*/
		/*for(String ele:al) {
			System.out.print(ele+" ");
		}*/
		for(int i=al.size()-1;i>=0;i--) {
			System.out.println(al.get(i)+" ");
		}
	}

}
