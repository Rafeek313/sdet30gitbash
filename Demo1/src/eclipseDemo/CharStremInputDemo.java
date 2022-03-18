package eclipseDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStremInputDemo {

	public static void main(String[] args) throws IOException {
		
			FileReader fr=new FileReader("Story.txt");
		BufferedReader br=new BufferedReader(fr);
		String Story=" ";
		while((Story=br.readLine())!=null) {
			System.out.println(Story);
		}
			br.close();
			fr.close();
		

}
}