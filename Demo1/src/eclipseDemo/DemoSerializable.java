package eclipseDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerializable {

	public static void main(String[] args) throws IOException {
		Student s=new Student();
		s.id=15;
		s.name="Rafeek";
		s.perc=55.5;
		s.adhar=860971067222L;
		FileOutputStream fos=new FileOutputStream("Student_info.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("write operation successfully");
		oos.close();
		fos.close();
}
}

