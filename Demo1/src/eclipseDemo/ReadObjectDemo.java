package eclipseDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectDemo {

	public static void main(String[] args) throws Exception {
     FileInputStream fis=new FileInputStream("Student_info.txt");
     ObjectInputStream ois=new ObjectInputStream(fis);
     Object obj = ois.readObject();
     Student s=(Student)obj;
     System.out.println(s.id+" "+s.name+" "+s.perc+" "+s.adhar);
     ois.close();
     fis.close();

	}

}
