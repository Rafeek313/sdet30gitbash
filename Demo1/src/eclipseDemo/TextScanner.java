package eclipseDemo;

public class TextScanner {
	Helloo obj;

	public TextScanner(Helloo obj){
		this.obj=obj;
	}
	public void scan() {
		String text="scanned text";
	 obj.onText(text);
	}
}
