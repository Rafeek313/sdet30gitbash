package eclipseDemo;

public class SampleRunThread implements Runnable{

	@Override
	public void run() {
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
		Thread t1=new Thread(s1);
		SampleThread s2=new SampleThread();
		Thread t2=new Thread(s2);
		SampleThread s3=new SampleThread();
		Thread t3=new Thread(s3);
		SampleThread s4=new SampleThread();
		Thread t4=new Thread(s4);
		SampleThread s5=new SampleThread();
		Thread t5=new Thread(s5);
		SampleThread s6=new SampleThread();
		Thread t6=new Thread(s6);
		SampleThread s7=new SampleThread();
		Thread t7=new Thread(s7);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();t7.start();

	}

}
