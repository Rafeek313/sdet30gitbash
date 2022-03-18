package eclipseDemo;
public class SampleThread extends Thread{
   @Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	for(int i=0;i<=10;i++) {
		System.out.println("thread coun"+i);
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	public static void main(String[] args) {
		SampleThread s1=new SampleThread();
		SampleThread s2=new SampleThread();
		SampleThread s3=new SampleThread();
		SampleThread s4=new SampleThread();
		SampleThread s5=new SampleThread();
		SampleThread s6=new SampleThread();
		SampleThread s7=new SampleThread();
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
		s6.start();s7.start();
	}

}
