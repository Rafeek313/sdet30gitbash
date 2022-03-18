package eclipseDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoCl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Collection<String> rcb=new ArrayList<>();
 rcb.add("kohli"); rcb.add("ABD");
 rcb.add(null);rcb.add("kohli");rcb.add(null);
 rcb.add("chahal");rcb.add("siraj");
 System.out.println(rcb);
 System.out.println(rcb.size());
 Collection<String> csk=new ArrayList<>();
 csk.add("dhoni"); csk.add("mohin alee");
 csk.add("imran");csk.add("jadeja");
 csk.add("dhoni"); csk.add(null);
 System.out.println(csk);
 System.out.println(csk.size());
 Collection<String> psl=new LinkedHashSet<>();
 Collection<String> ipl=new LinkedHashSet<>();
 ipl.addAll(rcb);
 ipl.addAll(csk);
 System.out.println(ipl);
 System.out.println(ipl.size());
 System.out.println(csk.contains("dhoni"));
 System.out.println(rcb.contains("padikkal"));
 System.out.println(ipl.containsAll(rcb));
 System.out.println(ipl.containsAll(csk));
 System.out.println(psl.isEmpty());
rcb.remove("ABD");
System.out.println(rcb);
ipl.removeAll(csk);
System.out.println(ipl);
ipl.clear();
System.out.println(ipl.size());
	}

}
