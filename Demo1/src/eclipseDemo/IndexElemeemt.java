package eclipseDemo;

public class IndexElemeemt {

	public static void main(String[] args) {
		int ar[]= {25,47,75,86,93};
		int index= getIndex(ar,86);
		if(index!=-1)
			System.out.println("present at"+index);
		else
			System.out.println("not present");
			}
	static int getIndex(int ar[],int ele) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele)
				return i;
		}
		return -1;
	}

}
