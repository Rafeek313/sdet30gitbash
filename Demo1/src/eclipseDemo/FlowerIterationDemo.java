package eclipseDemo;

import java.util.*;

public class FlowerIterationDemo {

	public static void main(String[] args) {
		Flower f1=new Flower("red","rose");
		Flower f2=new Flower("pink","lotus");
		Flower f3=new Flower("white","lilly");
		Flower f4=new Flower("red","hibiscus");
		
	Collection<Flower> cl=new ArrayList<Flower>();	
	cl.add(f1); cl.add(f2); cl.add(f3); cl.add(f4);
	Iterator<Flower> i=cl.iterator();
	System.out.println(i.next());
	System.out.println(i.next());
	System.out.println(i.next());
	System.out.println(cl);
	i.remove();
	System.out.println(cl);
	while(i.hasNext()) {
		Flower ele = i.next();
		System.out.println(ele);
	}

	}

}
