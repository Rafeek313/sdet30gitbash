package eclipseDemo;

public class Sample1 extends Helloo {
	@Override
	void onText(String text) 
	{
	System.out.println(text);
}

void Sample1() {
	TextScanner ts=new TextScanner(this);
	ts.scan();
}
public static void main(String[] args) {
	Sample1 s1=new Sample1();

}


}
