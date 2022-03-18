package eclipseDemo;

public class LocalVariable {
	int income=50000;
	void smoke() {
		String cig_name = "king";
		System.out.println(cig_name);

	}

	public static void main(String[] args) {
		LocalVariable l=new LocalVariable();
		l.smoke();

	}

}
